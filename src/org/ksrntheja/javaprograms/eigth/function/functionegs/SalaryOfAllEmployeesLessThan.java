package org.ksrntheja.javaprograms.eigth.function.functionegs;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee02 {

    String name;
    double salary;

    Employee02(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + ":" + salary;
    }

}


public class SalaryOfAllEmployeesLessThan {

    public static void main(String[] args) {

        ArrayList<Employee02> l = new ArrayList<Employee02>();
        populate(l);

        System.out.println("Before Increment:");
        System.out.println(l);

        Predicate<Employee02> employeePredicate = employee -> employee.salary < 3500;

        Function<Employee02, Employee02> incrementFunction = employee -> {
            employee.salary += 477;
            return employee;
        };

        for (Employee02 employee : l) {
            if (employeePredicate.test(employee)) {
                incrementFunction.apply(employee);
            }
        }

        System.out.println("After Increment:");
        System.out.println(l);


    }

    public static void populate(ArrayList<Employee02> l) {
        l.add(new Employee02("Sunny", 1000));
        l.add(new Employee02("Bunny", 2000));
        l.add(new Employee02("Chinny", 3000));
        l.add(new Employee02("Pinny", 4000));
        l.add(new Employee02("Vinny", 5000));
    }

}

/*
Before Increment:
[Sunny:1000.0, Bunny:2000.0, Chinny:3000.0, Pinny:4000.0, Vinny:5000.0]
After Increment:
[Sunny:1477.0, Bunny:2477.0, Chinny:3477.0, Pinny:4000.0, Vinny:5000.0]
 */
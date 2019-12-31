package org.ksrntheja.javaprograms.eigth.function.functionegs;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + ":" + salary;
    }

}


public class TotalMonthlySalaryOfAllEmployees {

    public static void main(String[] args) {

        ArrayList<Employee> l = new ArrayList<Employee>();
        populate(l);
        System.out.println(l);

        Function<ArrayList<Employee>, Double> salaryFunction = employees -> {
            double totalSalary = 0;
            for (Employee employee : employees) {
                totalSalary = totalSalary + employee.salary;
            }
            return totalSalary;
        };

        System.out.println("Total Salary : " + salaryFunction.apply(l));

    }

    public static void populate(ArrayList<Employee> l) {
        l.add(new Employee("Sunny", 1000));
        l.add(new Employee("Bunny", 2000));
        l.add(new Employee("Chinny", 3000));
        l.add(new Employee("Pinny", 4000));
        l.add(new Employee("Vinny", 5000));
    }

}

// [Sunny:1000.0, Bunny:2000.0, Chinny:3000.0, Pinny:4000.0, Vinny:5000.0]
// Total Salary : 15000.0
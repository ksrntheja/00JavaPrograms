package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces.consumerprimitive;


import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}


public class IncrementEmployeeSalaryPrimitiveConsumer {

    public static void main(String[] args) {

/*        BiConsumer<Employee, Double> incrementBiConsumer = (employee, increment) ->
                employee.salary = employee.salary + increment;*/

        ObjDoubleConsumer<Employee> incrementObjDoubleConsumer = (employee, increment) ->
                employee.salary = employee.salary + increment;

        ArrayList<Employee> employees = new ArrayList<>();
        populate(employees);

        for (Employee employee : employees) {
            incrementObjDoubleConsumer.accept(employee, 500.0);
        }

        for (Employee e : employees) {
            System.out.println("Employee Name: " + e.name);
            System.out.println("Employee Salary: " + e.salary);
            System.out.println();
        }

    }

    public static void populate(ArrayList<Employee> employees) {
        employees.add(new Employee("Durga", 1000));
        employees.add(new Employee("Sunny", 2000));
        employees.add(new Employee("Bunny", 3000));
        employees.add(new Employee("KSRN THEJA", 4000));
    }

}

/*
Employee Name: Durga
Employee Salary: 1500.0

Employee Name: Sunny
Employee Salary: 2500.0

Employee Name: Bunny
Employee Salary: 3500.0

Employee Name: KSRN THEJA
Employee Salary: 4500.0
 */
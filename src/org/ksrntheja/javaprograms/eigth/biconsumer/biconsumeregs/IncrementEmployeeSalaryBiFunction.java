package org.ksrntheja.javaprograms.eigth.biconsumer.biconsumeregs;


import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employee01 {

    String name;
    double salary;

    Employee01(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}


public class IncrementEmployeeSalaryBiFunction {

    public static void main(String[] args) {

        BiFunction<String, Double, Employee01> createEmployeeBiFunction = (name, salary) -> new Employee01(name, salary);

        BiConsumer<Employee01, Double> incrementBiConsumer = (employee, increment) ->
                employee.salary = employee.salary + increment;

        ArrayList<Employee01> employees = new ArrayList<>();

        employees.add(createEmployeeBiFunction.apply("Durga", 1000.0));
        employees.add(createEmployeeBiFunction.apply("Sunny", 2000.0));
        employees.add(createEmployeeBiFunction.apply("Bunny", 3000.0));
        employees.add(createEmployeeBiFunction.apply("KSRN THEJA", 4000.0));


        for (Employee01 employee : employees) {
            incrementBiConsumer.accept(employee, 500.0);
        }

        for (Employee01 e : employees) {
            System.out.println("Employee Name: " + e.name);
            System.out.println("Employee Salary: " + e.salary);
            System.out.println();
        }

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
package org.ksrntheja.javaprograms.eigth.lambdaexpressions.collections.ownclass;

import java.util.ArrayList;
import java.util.Collections;

class Employee {

    int employeeNumber;
    String employeeName;

    public Employee(int employeeNumber, String employeeName) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

}

public class EmployeeSortLambda {

    public static void main(String args[]) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(100, "THEJA"));
        employees.add(new Employee(200, "THEJA08"));
        employees.add(new Employee(800, "THEJA8"));
        employees.add(new Employee(300, "THEJA"));
        employees.add(new Employee(100, "THEJAKSRN"));

        System.out.println("Before sorting : " + employees);

        Collections.sort(employees, (employee01, employee02) ->
                employee01.employeeNumber > employee02.employeeNumber ? 1 : employee01.employeeNumber < employee02.employeeNumber ? -1 : 0);


        System.out.println("Before sorting : " + employees);

    }
}

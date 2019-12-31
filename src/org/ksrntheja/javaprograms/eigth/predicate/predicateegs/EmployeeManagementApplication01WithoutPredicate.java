package org.ksrntheja.javaprograms.eigth.predicate.predicateegs;

import java.util.ArrayList;

class Employee01 {

    String name;
    String designation;
    double salary;
    String city;

    Employee01(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

}

public class EmployeeManagementApplication01WithoutPredicate {

    public static void main(String[] args) {

        ArrayList<Employee01> employees = new ArrayList<>();

        Employee01 employee01 = new Employee01("Durga", "CEO", 30000, "Hyderabad");
        employees.add(employee01);

        System.out.println(employees);

    }

}

// [org.ksrntheja.javaprograms.eigth.predicate.predicateegs.Employee01@56cbfb61]
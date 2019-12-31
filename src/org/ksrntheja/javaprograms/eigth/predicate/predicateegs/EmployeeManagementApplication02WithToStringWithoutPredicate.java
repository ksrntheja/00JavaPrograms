package org.ksrntheja.javaprograms.eigth.predicate.predicateegs;

import java.util.ArrayList;

class Employee02 {

    String name;
    String designation;
    double salary;
    String city;

    Employee02(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        // [Durga,CEO,30000.000000,Hyderabad]
        // String string = String.format("%s,%s,%f,%s", name, designation, salary, city);
        // [Durga,CEO,30000.00,Hyderabad]
        // String string = String.format("%s,%s,%.2f,%s", name, designation, salary, city);
        // [Durga,CEO,30000.00,Hyderabad, THEJA,COO,29000.00,Bangalore]
        // String string = String.format("%s,%s,%.2f,%s", name, designation, salary, city);
        String string = String.format("(%s,%s,%.2f,%s)", name, designation, salary, city);
        return string;
    }

}

public class EmployeeManagementApplication02WithToStringWithoutPredicate {

    public static void main(String[] args) {

        ArrayList<Employee02> employees = new ArrayList<>();

        Employee02 employee01 = new Employee02("Durga", "CEO", 30000, "Hyderabad");
        Employee02 employee02 = new Employee02("THEJA", "COO", 29000, "Bangalore");

        employees.add(employee01);
        employees.add(employee02);

        System.out.println(employees);

    }

}

// [(Durga,CEO,30000.00,Hyderabad), (THEJA,COO,29000.00,Bangalore)]
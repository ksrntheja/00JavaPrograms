package org.ksrntheja.javaprograms.eigth.predicate.predicateegs;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee03 {

    String name;
    String designation;
    double salary;
    String city;

    Employee03(String name, String designation, double salary, String city) {
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

public class EmployeeManagementApplication03WithPredicate {

    public static void main(String[] args) {

        ArrayList<Employee03> employees = new ArrayList<>();
        populate(employees);
        System.out.println("Employees : " + employees);

        Predicate<Employee03> managerPredicate = employee -> employee.designation.equals("Manager");
        System.out.println("Managers : ");
        display(managerPredicate, employees);

        Predicate<Employee03> bangalorePredicate = employee -> employee.city.equals("Bangalore");
        System.out.println("Bangalore People : ");
        display(bangalorePredicate, employees);

        Predicate<Employee03> salaryPredicate = employee -> employee.salary < 20000;
        System.out.println("Salary less than 20000 People : ");
        display(salaryPredicate, employees);

        Predicate<Employee03> pinkSlipPredicate = employee -> employee.designation.equals("Manager") &&
                employee.city.equals("Bangalore");
        System.out.println("Bangalore Manager : ");
        display(pinkSlipPredicate, employees);

        System.out.println("Bangalore Manager [and Method] : ");
        display(managerPredicate.and(bangalorePredicate), employees);

        System.out.println("Manager || Salary less than 20000 : ");
        display(managerPredicate.or(salaryPredicate), employees);

        System.out.println("Not Managers : ");
        display(managerPredicate.negate(), employees);

    }

    public static void populate(ArrayList<Employee03> list) {
        list.add(new Employee03("Durga", "CEO", 30000, "Hyderabad"));
        list.add(new Employee03("Sunny", "Manager", 20000, "Hyderabad"));
        list.add(new Employee03("Mallika", "Manager", 20000, "Bangalore"));
        list.add(new Employee03("Kareena", "Lead", 15000, "Hyderabad"));
        list.add(new Employee03("Katrina", "Lead", 15000, "Bangalore"));
        list.add(new Employee03("Anushka", "Developer", 10000, "Hyderabad"));
        list.add(new Employee03("Kanushka", "Developer", 10000, "Hyderabad"));
        list.add(new Employee03("Sowmya", "Developer", 10000, "Bangalore"));
    }

    public static void display(Predicate<Employee03> employeePredicate, ArrayList<Employee03> employees) {
        for (Employee03 employee : employees) {
            if (employeePredicate.test(employee)) {
                System.out.println(employee);
            }
        }
        System.out.println("**************************************************");
    }

}

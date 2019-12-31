package org.ksrntheja.javaprograms.eigth.predicate.predicateegs;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

class Employee05 {

    String name;
    String designation;
    double salary;
    String city;

    Employee05(String name, String designation, double salary, String city) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee05 that = (Employee05) o;
        return Double.compare(that.salary, salary) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(designation, that.designation) &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, designation, salary, city);
    }
}

public class EmployeeManagementApplication05WithPredicateIsEqualsandEqualsMethod {

    public static void main(String[] args) {

        ArrayList<Employee05> employees = new ArrayList<>();
        populate(employees);
        System.out.println("Employees : " + employees);

        Predicate<Employee05> managerPredicate = employee -> employee.designation.equals("Manager");
        System.out.println("Managers : ");
        display(managerPredicate, employees);

        Predicate<Employee05> bangalorePredicate = employee -> employee.city.equals("Bangalore");
        System.out.println("Bangalore People : ");
        display(bangalorePredicate, employees);

        Predicate<Employee05> salaryPredicate = employee -> employee.salary < 20000;
        System.out.println("Salary less than 20000 People : ");
        display(salaryPredicate, employees);

        Predicate<Employee05> pinkSlipPredicate = employee -> employee.designation.equals("Manager") &&
                employee.city.equals("Bangalore");
        System.out.println("Bangalore Manager : ");
        display(pinkSlipPredicate, employees);

        System.out.println("Bangalore Manager [and Method] : ");
        display(managerPredicate.and(bangalorePredicate), employees);

        System.out.println("Manager || Salary less than 20000 : ");
        display(managerPredicate.or(salaryPredicate), employees);

        System.out.println("Not Managers : ");
        display(managerPredicate.negate(), employees);

        Predicate<Employee05> ceoPredicate =
                Predicate.isEqual(new Employee05("Durga", "CEO", 30000, "Hyderabad"));

        Employee05 e1 = new Employee05("Durga", "CEO", 30000, "Hyderabad");
        Employee05 e2 = new Employee05("Sunny", "Manager", 20000, "Hyderabad");
        System.out.println(ceoPredicate.test(e1));
        System.out.println(ceoPredicate.test(e2));

    }

    public static void populate(ArrayList<Employee05> list) {
        list.add(new Employee05("Durga", "CEO", 30000, "Hyderabad"));
        list.add(new Employee05("Sunny", "Manager", 20000, "Hyderabad"));
        list.add(new Employee05("Mallika", "Manager", 20000, "Bangalore"));
        list.add(new Employee05("Kareena", "Lead", 15000, "Hyderabad"));
        list.add(new Employee05("Katrina", "Lead", 15000, "Bangalore"));
        list.add(new Employee05("Anushka", "Developer", 10000, "Hyderabad"));
        list.add(new Employee05("Kanushka", "Developer", 10000, "Hyderabad"));
        list.add(new Employee05("Sowmya", "Developer", 10000, "Bangalore"));
    }

    public static void display(Predicate<Employee05> employeePredicate, ArrayList<Employee05> employees) {
        for (Employee05 employee : employees) {
            if (employeePredicate.test(employee)) {
                System.out.println(employee);
            }
        }
        System.out.println("**************************************************");
    }

}

/*
Employees : [(Durga,CEO,30000.00,Hyderabad), (Sunny,Manager,20000.00,Hyderabad), (Mallika,Manager,20000.00,Bangalore), (Kareena,Lead,15000.00,Hyderabad), (Katrina,Lead,15000.00,Bangalore), (Anushka,Developer,10000.00,Hyderabad), (Kanushka,Developer,10000.00,Hyderabad), (Sowmya,Developer,10000.00,Bangalore)]
Managers :
(Sunny,Manager,20000.00,Hyderabad)
(Mallika,Manager,20000.00,Bangalore)
**************************************************
Bangalore People :
(Mallika,Manager,20000.00,Bangalore)
(Katrina,Lead,15000.00,Bangalore)
(Sowmya,Developer,10000.00,Bangalore)
**************************************************
Salary less than 20000 People :
(Kareena,Lead,15000.00,Hyderabad)
(Katrina,Lead,15000.00,Bangalore)
(Anushka,Developer,10000.00,Hyderabad)
(Kanushka,Developer,10000.00,Hyderabad)
(Sowmya,Developer,10000.00,Bangalore)
**************************************************
Bangalore Manager :
(Mallika,Manager,20000.00,Bangalore)
**************************************************
Bangalore Manager [and Method] :
(Mallika,Manager,20000.00,Bangalore)
**************************************************
Manager || Salary less than 20000 :
(Sunny,Manager,20000.00,Hyderabad)
(Mallika,Manager,20000.00,Bangalore)
(Kareena,Lead,15000.00,Hyderabad)
(Katrina,Lead,15000.00,Bangalore)
(Anushka,Developer,10000.00,Hyderabad)
(Kanushka,Developer,10000.00,Hyderabad)
(Sowmya,Developer,10000.00,Bangalore)
**************************************************
Not Managers :
(Durga,CEO,30000.00,Hyderabad)
(Kareena,Lead,15000.00,Hyderabad)
(Katrina,Lead,15000.00,Bangalore)
(Anushka,Developer,10000.00,Hyderabad)
(Kanushka,Developer,10000.00,Hyderabad)
(Sowmya,Developer,10000.00,Bangalore)
**************************************************
true
false
 */
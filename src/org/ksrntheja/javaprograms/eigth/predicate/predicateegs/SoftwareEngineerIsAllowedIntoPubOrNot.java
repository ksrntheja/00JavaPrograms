package org.ksrntheja.javaprograms.eigth.predicate.predicateegs;

import java.util.function.Predicate;

class SoftwareEngineer {

    String name;
    int age;
    boolean isHavingGf;

    SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    public String toString() {
        return name;
    }

}


public class SoftwareEngineerIsAllowedIntoPubOrNot {

    public static void main(String[] args) {

        Predicate<SoftwareEngineer> pubPredicate = softwareEngineer -> softwareEngineer.age >= 18 && softwareEngineer.isHavingGf;

        SoftwareEngineer[] list = {
                new SoftwareEngineer("Durga", 60, false),
                new SoftwareEngineer("Theja", 25, true),
                new SoftwareEngineer("KSRN", 26, true),
                new SoftwareEngineer("Hello", 28, false),
                new SoftwareEngineer("World", 17, true)
        };

        System.out.println("The Allowed Members into Pub are:");

        for (SoftwareEngineer se : list) {
            if (pubPredicate.test(se)) {
                System.out.println(se);
            }
        }

    }

}

// The Allowed Members into Pub are:
// Theja
// KSRN
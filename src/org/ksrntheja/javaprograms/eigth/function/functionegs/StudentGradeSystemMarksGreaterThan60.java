package org.ksrntheja.javaprograms.eigth.function.functionegs;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student02 {

    String name;
    int marks;

    Student02(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}


public class StudentGradeSystemMarksGreaterThan60 {

    public static void main(String[] args) {

        ArrayList<Student02> l = new ArrayList<Student02>();
        populate(l);

        Function<Student02, String> f = s -> {
            int marks = s.marks;
            if (marks >= 80) {
                return "A[Dictinction]";
            } else if (marks >= 60) {
                return "B[First Class]";
            } else if (marks >= 50) {
                return "C[Second Class]";
            } else if (marks >= 35) {
                return "D[Third Class]";
            } else {
                return "E[Failed]";
            }
        };

        Predicate<Student02> marksPredicate = student -> student.marks >= 60;

        for (Student02 s : l) {
            if (marksPredicate.test(s)) {
                System.out.println("Student02 Name:" + s.name);
                System.out.println("Student02 Marks:" + s.marks);
                System.out.println("Student02 Grade:" + f.apply(s));
                System.out.println();
            }
        }

    }

    public static void populate(ArrayList<Student02> l) {
        l.add(new Student02("Sunny", 100));
        l.add(new Student02("Bunny", 65));
        l.add(new Student02("Chinny", 55));
        l.add(new Student02("Vinny", 45));
        l.add(new Student02("Pinny", 25));
    }

}

/*
Student02 Name:Sunny
Student02 Marks:100
Student02 Grade:A[Dictinction]

Student02 Name:Bunny
Student02 Marks:65
Student02 Grade:B[First Class]
 */
package org.ksrntheja.javaprograms.eigth.consumer.consumeregs;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}

public class DisplayStudentInformationUsingPredicateFunctionConsumer {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        populate(students);

        Predicate<Student> marksCheck = student -> student.marks > 60;

        Function<Student, String> gradefunction = student -> {
            int marks = student.marks;
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

        Consumer<Student> displayStudent = student -> {
            System.out.println(student.name);
            System.out.println(student.marks);
            System.out.println(gradefunction.apply(student));
        };

        for (Student student : students) {
            if (marksCheck.test(student)) {
                displayStudent.accept(student);
            }
        }

    }

    public static void populate(ArrayList<Student> l) {
        l.add(new Student("Sunny", 100));
        l.add(new Student("Bunny", 65));
        l.add(new Student("Chinny", 55));
        l.add(new Student("Vinny", 45));
        l.add(new Student("Pinny", 25));
    }
}

/*
Sunny
100
A[Dictinction]
Bunny
65
B[First Class]
 */
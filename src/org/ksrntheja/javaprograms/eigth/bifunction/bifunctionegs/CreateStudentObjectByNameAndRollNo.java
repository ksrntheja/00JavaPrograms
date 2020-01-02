package org.ksrntheja.javaprograms.eigth.bifunction.bifunctionegs;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student {

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

}

public class CreateStudentObjectByNameAndRollNo {

    public static void main(String[] args) {

        BiFunction<String, Integer, Student> createStudentPBiFunction = (name, rollNo) -> new Student(name, rollNo);

        ArrayList<Student> students = new ArrayList<>();

        students.add(createStudentPBiFunction.apply("Durga", 100));
        students.add(createStudentPBiFunction.apply("KSRN", 200));
        students.add(createStudentPBiFunction.apply("Shiva", 300));
        students.add(createStudentPBiFunction.apply("Theja", 400));

        for (Student s : students) {
            System.out.println("Student Name:" + s.name);
            System.out.println("Student RollNo:" + s.rollNo);
            System.out.println();
        }

    }

}

/*
Student Name:Durga
Student RollNo:100

Student Name:KSRN
Student RollNo:200

Student Name:Shiva
Student RollNo:300

Student Name:Theja
Student RollNo:400
 */
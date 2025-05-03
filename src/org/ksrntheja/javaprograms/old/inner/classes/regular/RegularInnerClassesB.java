/*
 * (8) Inner Classes
 * (8 - 1B) Normal / Regular Inner Classes - Adding main(_) in Outer
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

public class RegularInnerClassesB {

    class Inner {

    }

    public static void main(String[] args) {
        System.out.println("RegularInnerClassesB main(_)");
    }

}
/*

// package org.ksrntheja.javaprograms.eight.old.inner.classes;

javac RegularInnerClassesB.java

java RegularInnerClassesB
    RegularInnerClassesB main(_)

java RegularInnerClassesB$Inner
    Error: Main method not found in class RegularInnerClassesB$Inner, please define the main method as:
       public static void main(String[] args)
    or a JavaFX application class must extend javafx.application.Application

 */

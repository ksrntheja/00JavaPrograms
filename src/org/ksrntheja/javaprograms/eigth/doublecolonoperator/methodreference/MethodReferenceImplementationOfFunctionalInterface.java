package org.ksrntheja.javaprograms.eigth.doublecolonoperator.methodreference;

@FunctionalInterface
interface MethodReferenceImplementationOfFunctionalInterfaceEg {

    void m1();

}


public class MethodReferenceImplementationOfFunctionalInterface {

    // public static void m2(int i) {
    public static void m2() {

        System.out.println("MethodReferenceImplementationOfFunctionalInterface Example Code");

    }

    public static void main(String[] args) {


        MethodReferenceImplementationOfFunctionalInterfaceEg methodReferenceImplementationOfFunctionalInterfaceEg =
                MethodReferenceImplementationOfFunctionalInterface::m2;

        // incompatible types: invalid method reference
        //    method m2 in class org.ksrntheja.javaprograms.eigth.doublecolonoperator.methodreference.MethodReferenceImplementationOfFunctionalInterface cannot be applied to given types
        //      required: int
        //      found: no arguments
        //      reason: actual and formal argument lists differ in length

        methodReferenceImplementationOfFunctionalInterfaceEg.m1();

    }

}

// MethodReferenceImplementationOfFunctionalInterface Example Code
package org.ksrntheja.javaprograms.eigth.defaultmethods;

interface Left02 {

    default void m1() {
        System.out.println("Left Default Method");
    }

}

interface Right02 {

    default void m1() {
        System.out.println("Right Default Method");
    }

}


public class DefaultMethodInterfaceMultipleInheritanceSolution02 implements Left02, Right02 {

    @Override
    public void m1() {
        Left02.super.m1();
    }

    public static void main(String args[]) {

        DefaultMethodInterfaceMultipleInheritanceSolution02 defaultMethodInterfaceMultipleInheritanceSolution02 = new
                DefaultMethodInterfaceMultipleInheritanceSolution02();
        defaultMethodInterfaceMultipleInheritanceSolution02.m1();

    }

}

// Left Default Method

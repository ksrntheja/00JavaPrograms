package org.ksrntheja.javaprograms.eigth.defaultmethods;

interface Left01 {

    default void m1() {
        System.out.println("Left Default Method");
    }

}

interface Right01 {

    default void m1() {
        System.out.println("Right Default Method");
    }

}


public class DefaultMethodInterfaceMultipleInheritanceSolution01 implements Left01, Right01 {

    @Override
    public void m1() {
        System.out.println("DefaultMethodInterfaceMultipleInheritanceSolution01 m1() method");

    }

    public static void main(String args[]) {

        DefaultMethodInterfaceMultipleInheritanceSolution01 defaultMethodInterfaceMultipleInheritanceSolution01 = new
                DefaultMethodInterfaceMultipleInheritanceSolution01();
        defaultMethodInterfaceMultipleInheritanceSolution01.m1();

    }

}

// DefaultMethodInterfaceMultipleInheritanceSolution01 m1() method

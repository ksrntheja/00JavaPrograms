package org.ksrntheja.javaprograms.eigth.defaultmethods;

interface Left {

    default void m1() {
        System.out.println("Left Default Method");
    }

}

interface Right {

    default void m1() {
        System.out.println("Right Default Method");
    }

}


public class DefaultMethodInterfaceMultipleInheritance implements Left, Right {

    // org.ksrntheja.javaprograms.eigth.defaultmethods.DefaultMethodInterfaceMultipleInheritance
    // inherits unrelated defaults for m1() from types
    // org.ksrntheja.javaprograms.eigth.defaultmethods.Left and
    // org.ksrntheja.javaprograms.eigth.defaultmethods.Right

    public static void main(String args[]) {

    }

}

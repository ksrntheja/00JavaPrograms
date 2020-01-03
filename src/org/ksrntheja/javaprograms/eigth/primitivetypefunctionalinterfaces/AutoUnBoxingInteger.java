package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces;

public class AutoUnBoxingInteger {

    public static void main(String[] args) {

        Integer integer = new Integer(10);
        int x = integer;
        // int x = integer.intValue();
        // Unnecessary unboxing 'integer.intValue()'

        System.out.println("integer: " + integer);
        System.out.println("x: " + x);

    }

}

// integer: 10
// x: 10
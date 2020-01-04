package org.ksrntheja.javaprograms.eigth.bifunction.binaryoperator.primitive;


import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorSum {

    public static void main(String[] args) {

        // BinaryOperator<Integer> sumBinaryOperator = (integer01, integer02) -> integer01 + integer02;
        // System.out.println("6 + 2 = " + sumBinaryOperator.apply(6, 2));

        IntBinaryOperator sumIntBinaryOperator = (int01, int02) -> int01 + int02;

        System.out.println("6 + 2 = " + sumIntBinaryOperator.applyAsInt(6, 2));

    }

}

// 6 + 2 = 8
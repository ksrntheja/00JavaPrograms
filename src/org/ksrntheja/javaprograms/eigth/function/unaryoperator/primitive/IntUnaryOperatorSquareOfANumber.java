package org.ksrntheja.javaprograms.eigth.function.unaryoperator.primitive;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorSquareOfANumber {

    public static void main(String[] args) {

        // Function<Integer, Integer> stringIntegerFunction = integer -> integer * integer;
        // UnaryOperator<Integer> squareUnaryOperator = integer -> integer * integer;

        IntUnaryOperator squareIntUnaryOperator = int01 -> int01 * int01;
        System.out.println(squareIntUnaryOperator.applyAsInt(8));
        System.out.println(squareIntUnaryOperator.applyAsInt(80));

    }

}

// 64
// 6400
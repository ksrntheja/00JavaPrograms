package org.ksrntheja.javaprograms.eigth.function.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorSquareOfANumber {

    public static void main(String args[]) {

        // Function<Integer, Integer> stringIntegerFunction = integer -> integer * integer;
        UnaryOperator<Integer> squareUnaryOperator = integer -> integer * integer;
        System.out.println(squareUnaryOperator.apply(8));
        System.out.println(squareUnaryOperator.apply(80));

    }

}

// 64
// 6400
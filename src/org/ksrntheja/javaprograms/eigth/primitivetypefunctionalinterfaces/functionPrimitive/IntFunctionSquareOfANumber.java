package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces.functionPrimitive;

import java.util.function.IntFunction;

public class IntFunctionSquareOfANumber {

    public static void main(String[] args) {

        IntFunction<Integer> squareFunction = int01 -> int01 * int01;
        // Function<Integer, Integer> squareFunction = integer -> integer * integer;

        System.out.println(squareFunction.apply(8));
        System.out.println(squareFunction.apply(80));

    }

}

// 64
// 6400
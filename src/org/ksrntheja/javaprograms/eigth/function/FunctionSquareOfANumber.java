package org.ksrntheja.javaprograms.eigth.function;

import java.util.function.Function;

public class FunctionSquareOfANumber {

    public static void main(String args[]) {

        Function<Integer, Integer> stringIntegerFunction = integer -> integer * integer;
        System.out.println(stringIntegerFunction.apply(8));
        System.out.println(stringIntegerFunction.apply(80));

    }

}

// 64
// 6400
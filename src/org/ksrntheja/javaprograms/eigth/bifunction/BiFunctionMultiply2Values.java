package org.ksrntheja.javaprograms.eigth.bifunction;

import java.util.function.BiFunction;

public class BiFunctionMultiply2Values {

    public static void main(String args[]) {

        BiFunction<Integer, Integer, Integer> integerBiFunction = (integer01, integer02) -> integer01 * integer02;

        System.out.println("8 * 80 : " + integerBiFunction.apply(8, 80));
        System.out.println("8 * 35 : " + integerBiFunction.apply(8, 35));

    }

}

// 8 * 80 : 640
// 8 * 35 : 280
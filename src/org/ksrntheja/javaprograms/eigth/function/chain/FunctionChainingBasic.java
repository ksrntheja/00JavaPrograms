package org.ksrntheja.javaprograms.eigth.function.chain;

import java.util.function.Function;

public class FunctionChainingBasic {

    public static void main(String args[]) {

        Function<String, String> upperCaseFunction = string -> string.toUpperCase();
        Function<String, String> substringFunction = string -> string.substring(0, 9);

        System.out.println(upperCaseFunction.apply("Ksrntheja08"));

        System.out.println(substringFunction.apply("Ksrntheja08"));

        // System.out.println(upperCaseFunction.andThen(substringFunction));
        // java.util.function.Function$$Lambda$16/0x0000000100066440@6b71769e

        // System.out.println(upperCaseFunction.compose(substringFunction));
        // java.util.function.Function$$Lambda$18/0x0000000100065c40@e580929

        System.out.println(upperCaseFunction.andThen(substringFunction).apply("Ksrntheja08"));

        System.out.println(upperCaseFunction.compose(substringFunction).apply("Ksrntheja08"));


    }


}

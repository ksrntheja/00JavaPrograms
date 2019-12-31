package org.ksrntheja.javaprograms.eigth.function;

import java.util.function.Function;

public class FunctionLengthOfString {

    public static void main(String args[]) {

        Function<String, Integer> stringIntegerFunction = string -> string.length();
        System.out.println(stringIntegerFunction.apply("KSRNTHEJA"));
        System.out.println(stringIntegerFunction.apply("THEJA"));

    }

}

// 9
// 5
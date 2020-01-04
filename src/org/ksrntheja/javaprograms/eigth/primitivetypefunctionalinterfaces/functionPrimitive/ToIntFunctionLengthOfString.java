package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces.functionPrimitive;

import java.util.function.ToIntFunction;

public class ToIntFunctionLengthOfString {

    public static void main(String args[]) {

        ToIntFunction<String> stringLengthToIntFunction = string -> string.length();
        // Function<String, Integer> stringIntegerFunction = string -> string.length();

        System.out.println(stringLengthToIntFunction.applyAsInt("KSRNTHEJA"));
        System.out.println(stringLengthToIntFunction.applyAsInt("THEJA"));

    }

}

// 9
// 5
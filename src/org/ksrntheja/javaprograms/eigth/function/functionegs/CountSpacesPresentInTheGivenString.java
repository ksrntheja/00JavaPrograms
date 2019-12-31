package org.ksrntheja.javaprograms.eigth.function.functionegs;

import java.util.function.Function;

public class CountSpacesPresentInTheGivenString {

    public static void main(String[] args) {

        Function<String, Integer> stringFunction = string -> string.length() - string.replaceAll(" ", "").length();

        System.out.println(stringFunction.apply("KSRN THEJA"));

    }

}

// 1
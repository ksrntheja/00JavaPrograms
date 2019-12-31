package org.ksrntheja.javaprograms.eigth.function.functionegs;

import java.util.function.Function;

public class RemoveSpacesPresentInTheGivenString {

    public static void main(String[] args) {

        /*Function<String, String> stringFunction = string -> {
            String str = "";
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != ' ') {
                    str = str + string.charAt(i);
                }
            }
            return str;
        };*/

        Function<String, String> stringFunction = string -> string.replaceAll(" ", "");

        System.out.println(stringFunction.apply("KSRN THEJA"));

    }

}

// KSRNTHEJA
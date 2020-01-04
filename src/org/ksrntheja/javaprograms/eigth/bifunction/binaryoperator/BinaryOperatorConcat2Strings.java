package org.ksrntheja.javaprograms.eigth.bifunction.binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorConcat2Strings {

    public static void main(String[] args) {

        // BiFunction<String, String, String> concatStringsBiFunction = (string01, string02) -> string01 + string02;
        // System.out.println("KSRN + THEJA : " + concatStringsBiFunction.apply("KSRN", "THEJA"));

        BinaryOperator<String> concatStringBinaryOperator = (string01, string02) -> string01 + string02;

        System.out.println("KSRN + THEJA : " + concatStringBinaryOperator.apply("KSRN", "THEJA"));

    }


}

// KSRN + THEJA : KSRNTHEJA
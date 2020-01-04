package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces.functionPrimitive;

// import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class IntToDoubleSqrt {

    public static void main(String[] args) {

        // Function<Integer, Double> sqrtFunction = int01 -> Math.sqrt(8);
        // System.out.println("SquareRoot of 8 : " + sqrtFunction.apply(8));

        IntToDoubleFunction intToDoubleSqrtFunction = int01 -> Math.sqrt(8);
        System.out.println("SquareRoot of 8 : " + intToDoubleSqrtFunction.applyAsDouble(8));

    }

}

// SquareRoot of 8 : 2.8284271247461903
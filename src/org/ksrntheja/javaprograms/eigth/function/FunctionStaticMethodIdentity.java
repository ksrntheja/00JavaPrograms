package org.ksrntheja.javaprograms.eigth.function;

import java.util.function.Function;

public class FunctionStaticMethodIdentity {

    public static void main(String[] args) {

        Function<String, String> identityFunction = Function.identity();
        System.out.println("identityFunction.apply(\"KSRNTHEJA\") : " + identityFunction.apply("KSRNTHEJA"));

    }

}

// identityFunction.apply("KSRNTHEJA") : KSRNTHEJA
package org.ksrntheja.javaprograms.eigth.doublecolonoperator.methodreference;

@FunctionalInterface
interface LambdaExpressionImplementationOfFunctionalInterfaceEg {

    void m1();

}


public class LambdaExpressionImplementationOfFunctionalInterface {

    public static void main(String[] args) {

        LambdaExpressionImplementationOfFunctionalInterfaceEg lambdaExpressionImplementationOfFunctionalInterfaceEg =
                () -> {
                    System.out.println("LambdaExpressionImplementationOfFunctionalInterface Example Code");
                };

        lambdaExpressionImplementationOfFunctionalInterfaceEg.m1();

    }

}

// LambdaExpressionImplementationOfFunctionalInterface Example Code
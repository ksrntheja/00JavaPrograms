package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions;

// @FunctionalInterface
interface LambdaExpressionThatImplementsInterfaceWithSingleMethodExample {

    void hello();

}


public class LambdaExpressionThatImplementsInterfaceWithSingleMethod {

    public static void main(String args[]) {

        LambdaExpressionThatImplementsInterfaceWithSingleMethodExample lambdaExpressionThatImplementsInterfaceWithSingleMethodExample = () ->
                System.out.println("Hello from LambdaExpressionThatImplementsInterfaceWithSingleMethod");

        lambdaExpressionThatImplementsInterfaceWithSingleMethodExample.hello();

    }

}

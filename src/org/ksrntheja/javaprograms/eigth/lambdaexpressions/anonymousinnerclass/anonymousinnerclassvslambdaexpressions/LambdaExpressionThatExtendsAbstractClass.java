package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions;

abstract class LambdaExpressionThatExtendsAbstractClassExample {

    abstract public void hello();

}


public class LambdaExpressionThatExtendsAbstractClass {

    public static void main(String args[]) {

        LambdaExpressionThatExtendsAbstractClassExample lambdaExpressionThatExtendsAbstractClassExample = () ->
                System.out.println("Hello from LambdaExpressionThatExtendsAbstractClass");

        // Target type of a lambda conversion must be an interface
        // Error:(14, 107) java: incompatible types: org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions.LambdaExpressionThatExtendsAbstractClassExample is not a functional interface

        lambdaExpressionThatExtendsAbstractClassExample.hello();

    }

}

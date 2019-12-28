package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions;

class LambdaExpressionThatExtendsConcreteClassExample {

    public void hello() {
        System.out.println("Hello from LambdaExpressionThatExtendsConcreteClassExample");
    }

}


public class LambdaExpressionThatExtendsConcreteClass {

    public static void main(String args[]) {

        LambdaExpressionThatExtendsConcreteClassExample lambdaExpressionThatExtendsConcreteClassExample = () ->
                System.out.println("Hello from LambdaExpressionThatExtendsConcreteClass");


        // Target type of a lambda conversion must be an interface

        // Error: incompatible types: org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions.LambdaExpressionThatExtendsConcreteClassExample is not a functional interface

        lambdaExpressionThatExtendsConcreteClassExample.hello();

    }

}

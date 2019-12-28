package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions;

interface LambdaExpressionThatImplementsInterfaceWithMultipleMethodsExample {

    void hello();

    void hi();

}


public class LambdaExpressionThatImplementsInterfaceWithMultipleMethods {

    public static void main(String args[]) {

        LambdaExpressionThatImplementsInterfaceWithMultipleMethodsExample lambdaExpressionThatImplementsInterfaceWithMultipleMethodsExample = () -> {

            @Override
            public void hello () { // Expression expected
                System.out.println("Hello from LambdaExpressionThatImplementsInterfaceWithMultipleMethods");
            }

            // Annotations are not allowed here

            @Override
            public void hi () {
                System.out.println("Hi from LambdaExpressionThatImplementsInterfaceWithMultipleMethods");
            }

        };

        lambdaExpressionThatImplementsInterfaceWithMultipleMethodsExample.hello();
        lambdaExpressionThatImplementsInterfaceWithMultipleMethodsExample.hi();

    }

}

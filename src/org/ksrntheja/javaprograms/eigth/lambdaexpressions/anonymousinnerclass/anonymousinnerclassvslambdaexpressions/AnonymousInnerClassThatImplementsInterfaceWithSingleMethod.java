package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions;

// @FunctionalInterface
interface AnonymousInnerClassThatImplementsInterfaceWithSingleMethodExample {

    void hello();

}


public class AnonymousInnerClassThatImplementsInterfaceWithSingleMethod {

    public static void main(String args[]) {

        AnonymousInnerClassThatImplementsInterfaceWithSingleMethodExample anonymousInnerClassThatImplementsInterfaceWithSingleMethodExample = new
                AnonymousInnerClassThatImplementsInterfaceWithSingleMethodExample() {

                    @Override
                    public void hello() {
                        System.out.println("Hello from AnonymousInnerClassThatImplementsInterfaceWithSingleMethod");
                    }

                };

        anonymousInnerClassThatImplementsInterfaceWithSingleMethodExample.hello();

    }

}

// Hello from AnonymousInnerClassThatImplementsInterfaceWithSingleMethod
package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions;

interface AnonymousInnerClassThatImplementsInterfaceWithMultipleMethodsExample {

    void hello();

    void hi();

}


public class AnonymousInnerClassThatImplementsInterfaceWithMultipleMethods {

    public static void main(String args[]) {

        AnonymousInnerClassThatImplementsInterfaceWithMultipleMethodsExample anonymousInnerClassThatImplementsInterfaceWithMultipleMethodsExample = new
                AnonymousInnerClassThatImplementsInterfaceWithMultipleMethodsExample() {

                    @Override
                    public void hello() {
                        System.out.println("Hello from AnonymousInnerClassThatImplementsInterfaceWithMultipleMethods");
                    }

                    @Override
                    public void hi() {
                        System.out.println("Hi from AnonymousInnerClassThatImplementsInterfaceWithMultipleMethods");
                    }

                };

        anonymousInnerClassThatImplementsInterfaceWithMultipleMethodsExample.hello();
        anonymousInnerClassThatImplementsInterfaceWithMultipleMethodsExample.hi();

    }

}

// Hello from AnonymousInnerClassThatImplementsInterfaceWithMultipleMethods
// Hi from AnonymousInnerClassThatImplementsInterfaceWithMultipleMethods
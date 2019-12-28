package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions;

class AnonymousInnerClassThatExtendsConcreteClassExample {

    public void hello() {
        System.out.println("Hello from AnonymousInnerClassThatExtendsConcreteClassExample");
    }

}


public class AnonymousInnerClassThatExtendsConcreteClass {

    public static void main(String args[]) {

        AnonymousInnerClassThatExtendsConcreteClassExample anonymousInnerClassThatExtendsConcreteClassExample = new
                AnonymousInnerClassThatExtendsConcreteClassExample() {
                    @Override
                    public void hello() {
                        System.out.println("Hello from AnonymousInnerClassThatExtendsConcreteClass");
                    }
                };

        anonymousInnerClassThatExtendsConcreteClassExample.hello();

    }

}

// Hello from AnonymousInnerClassThatExtendsConcreteClass
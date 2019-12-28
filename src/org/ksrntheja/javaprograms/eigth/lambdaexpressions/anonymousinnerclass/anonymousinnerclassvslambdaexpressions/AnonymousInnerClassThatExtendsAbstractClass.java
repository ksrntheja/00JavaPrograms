package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressions;

abstract class AnonymousInnerClassThatExtendsAbstractClassExample {

    abstract public void hello();

}


public class AnonymousInnerClassThatExtendsAbstractClass {

    public static void main(String args[]) {

        AnonymousInnerClassThatExtendsAbstractClassExample anonymousInnerClassThatExtendsAbstractClassExample = new
                AnonymousInnerClassThatExtendsAbstractClassExample() {

                    @Override
                    public void hello() {
                        System.out.println("Hello from AnonymousInnerClassThatExtendsAbstractClass");
                    }

                };

        anonymousInnerClassThatExtendsAbstractClassExample.hello();

    }

}

// Hello from AnonymousInnerClassThatExtendsAbstractClass
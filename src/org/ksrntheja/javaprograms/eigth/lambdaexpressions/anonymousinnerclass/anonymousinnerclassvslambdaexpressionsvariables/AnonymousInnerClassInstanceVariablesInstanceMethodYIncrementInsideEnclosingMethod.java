package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressionsvariables;

interface AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface {

    void m01();

}


public class AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod {

    int x = 111;

    public void m02() {

        int y = 222;
        y++;

        AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface anonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface = new
                AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface() {

                    int x = 333;

                    @Override
                    public void m01() {
                        int x = 444;

                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod x " + x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod this.x " + this.x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod y " + y);
                        // Variable 'y' is accessed from within inner class, needs to be final or effectively final
                        // Error:(30, 136) java: local variables referenced from an inner class must be final or effectively final
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod" +
                                "AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod.this.x "
                                + AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod.this.x);

                    }

                };

        anonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface.m01();

    }

    public static void main(String[] args) {


        AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod anonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod = new
                AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod();
        anonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod.m02();

    }
}

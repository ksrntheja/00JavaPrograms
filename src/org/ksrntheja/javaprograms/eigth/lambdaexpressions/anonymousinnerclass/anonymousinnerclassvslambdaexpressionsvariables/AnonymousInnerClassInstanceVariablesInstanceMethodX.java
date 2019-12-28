package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressionsvariables;

interface AnonymousInnerClassInstanceVariablesInstanceMethodXInterface {

    void m01();

}


public class AnonymousInnerClassInstanceVariablesInstanceMethodX {

    int x = 111;

    public void m02() {

        int x = 222;

        AnonymousInnerClassInstanceVariablesInstanceMethodXInterface anonymousInnerClassInstanceVariablesInstanceMethodXInterface = new
                AnonymousInnerClassInstanceVariablesInstanceMethodXInterface() {

                    int x = 333;

                    @Override
                    public void m01() {
                        int x = 444;
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodX x " + x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodX this.x " + this.x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodX" +
                                "AnonymousInnerClassInstanceVariablesInstanceMethodX.this.x "
                                + AnonymousInnerClassInstanceVariablesInstanceMethodX.this.x);
                    }

                };

        anonymousInnerClassInstanceVariablesInstanceMethodXInterface.m01();

    }

    public static void main(String[] args) {

        // int x = 10;
        // int x = 10;
        // Variable 'x' is already defined in the scope

        AnonymousInnerClassInstanceVariablesInstanceMethodX anonymousInnerClassInstanceVariablesInstanceMethodX = new
                AnonymousInnerClassInstanceVariablesInstanceMethodX();
        anonymousInnerClassInstanceVariablesInstanceMethodX.m02();

    }
}

// In AnonymousInnerClassInstanceVariablesInstanceMethodX x 444
// In AnonymousInnerClassInstanceVariablesInstanceMethodX this.x 333
// In AnonymousInnerClassInstanceVariablesInstanceMethodXAnonymousInnerClassInstanceVariablesInstanceMethodX.this.x 111
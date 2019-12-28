package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressionsvariables;

interface AnonymousInnerClassInstanceVariablesInstanceMethodYInterface {

    void m01();

}


public class AnonymousInnerClassInstanceVariablesInstanceMethodY {

    int x = 111;

    public void m02() {

        int y = 222;

        AnonymousInnerClassInstanceVariablesInstanceMethodYInterface anonymousInnerClassInstanceVariablesInstanceMethodYInterface = new
                AnonymousInnerClassInstanceVariablesInstanceMethodYInterface() {

                    int x = 333;

                    @Override
                    public void m01() {
                        int x = 444;
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodY x " + x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodY this.x " + this.x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodY y " + y);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodY" +
                                "AnonymousInnerClassInstanceVariablesInstanceMethodY.this.x "
                                + AnonymousInnerClassInstanceVariablesInstanceMethodY.this.x);
                    }

                };

        anonymousInnerClassInstanceVariablesInstanceMethodYInterface.m01();

    }

    public static void main(String[] args) {

        // int x = 10;
        // int x = 10;
        // Variable 'x' is already defined in the scope

        AnonymousInnerClassInstanceVariablesInstanceMethodY anonymousInnerClassInstanceVariablesInstanceMethodY = new
                AnonymousInnerClassInstanceVariablesInstanceMethodY();
        anonymousInnerClassInstanceVariablesInstanceMethodY.m02();

    }
}

// In AnonymousInnerClassInstanceVariablesInstanceMethodY x 444
// In AnonymousInnerClassInstanceVariablesInstanceMethodY this.x 333
// In AnonymousInnerClassInstanceVariablesInstanceMethodY y 222
// In AnonymousInnerClassInstanceVariablesInstanceMethodYAnonymousInnerClassInstanceVariablesInstanceMethodY.this.x 111
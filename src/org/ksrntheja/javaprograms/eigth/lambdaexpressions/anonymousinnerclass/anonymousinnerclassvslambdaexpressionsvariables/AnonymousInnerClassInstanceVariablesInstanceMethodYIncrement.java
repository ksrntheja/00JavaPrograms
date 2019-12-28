package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressionsvariables;

interface AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInterface {

    void m01();

}


public class AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement {

    int x = 111;

    public void m02() {

        int y = 222;

        AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInterface anonymousInnerClassInstanceVariablesInstanceMethodYIncrementInterface = new
                AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInterface() {

                    int x = 333;

                    @Override
                    public void m01() {
                        int x = 444;

                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement x " + x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement this.x " + this.x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement y " + y);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement" +
                                "AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement.this.x "
                                + AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement.this.x);

                        System.out.println("After Increment : ");

                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement x " + ++x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement this.x " + ++this.x);
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement y " + ++y);
                        // Variable 'y' is accessed from within inner class, needs to be final or effectively final
                        System.out.println("In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement" +
                                "AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement.this.x "
                                + ++AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement.this.x);


                    }

                };

        anonymousInnerClassInstanceVariablesInstanceMethodYIncrementInterface.m01();

    }

    public static void main(String[] args) {

        // int x = 10;
        // int x = 10;
        // Variable 'x' is already defined in the scope

        AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement anonymousInnerClassInstanceVariablesInstanceMethodYIncrement = new
                AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement();
        anonymousInnerClassInstanceVariablesInstanceMethodYIncrement.m02();

    }
}

// In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement x 444
// In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement this.x 333
// In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement y 222
// In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementAnonymousInnerClassInstanceVariablesInstanceMethodYIncrement.this.x 111

// After Increment :

// In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement x 445
// In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrement this.x 334
// In AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementAnonymousInnerClassInstanceVariablesInstanceMethodYIncrement.this.x 112
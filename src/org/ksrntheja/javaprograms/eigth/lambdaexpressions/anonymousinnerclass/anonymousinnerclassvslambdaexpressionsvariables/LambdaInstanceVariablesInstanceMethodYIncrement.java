package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressionsvariables;

interface LambdaInstanceVariablesInstanceMethodYIncrementInterface {

    void m01();

}


public class LambdaInstanceVariablesInstanceMethodYIncrement {

    int x = 111;

    public void m02() {

        int y = 222;

        LambdaInstanceVariablesInstanceMethodYIncrementInterface lambdaInstanceVariablesInstanceMethodYIncrementInterface = // new
                // LambdaInstanceVariablesInstanceMethodYIncrementInterface() {

                // int x = 333;

                //@Override
                // public void m01() {
                () -> {
                    int x = 444;

                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrement x " + x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrement this.x " + this.x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrement y " + y);
                    // Variable used in lambda expression should be final or effectively final
                    // Error:(30, 98) java: local variables referenced from a lambda expression must be final or effectively final
                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrement" +
                            "LambdaInstanceVariablesInstanceMethodYIncrement.this.x "
                            + LambdaInstanceVariablesInstanceMethodYIncrement.this.x);

                    System.out.println("After Increment : ");

                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrement x " + ++x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrement this.x " + ++this.x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrement y " + ++y);
                    // Variable used in lambda expression should be final or effectively final
                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrement" +
                            "LambdaInstanceVariablesInstanceMethodYIncrement.this.x "
                            + ++LambdaInstanceVariablesInstanceMethodYIncrement.this.x);


                };


        lambdaInstanceVariablesInstanceMethodYIncrementInterface.m01();

    }

    public static void main(String[] args) {


        LambdaInstanceVariablesInstanceMethodYIncrement lambdaInstanceVariablesInstanceMethodYIncrement = new
                LambdaInstanceVariablesInstanceMethodYIncrement();
        lambdaInstanceVariablesInstanceMethodYIncrement.m02();

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
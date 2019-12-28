package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressionsvariables;

interface LambdaInstanceVariablesInstanceMethodXInterface {

    void m01();

}


public class LambdaInstanceVariablesInstanceMethodX {

    int x = 111;

    public void m02() {

        int x = 222;

        LambdaInstanceVariablesInstanceMethodXInterface lambdaInstanceVariablesInstanceMethodXInterface = // new
                // AnonymousInnerClassInstanceVariablesInstanceMethodXInterface() {

                // int x = 333;

                // @Override
                //public void m01 () {
                () -> {
                    int x = 444;
                    // Variable 'x' is already defined in the scope // int x = 222;
                    System.out.println("In LambdaInstanceVariablesInstanceMethodX x " + x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodX this.x " + this.x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodX" +
                            "LambdaInstanceVariablesInstanceMethodX.this.x "
                            + LambdaInstanceVariablesInstanceMethodX.this.x);
                };

        lambdaInstanceVariablesInstanceMethodXInterface.m01();

    }

    public static void main(String[] args) {

        LambdaInstanceVariablesInstanceMethodX lambdaInstanceVariablesInstanceMethodX = new
                LambdaInstanceVariablesInstanceMethodX();
        lambdaInstanceVariablesInstanceMethodX.m02();

    }
}

// In AnonymousInnerClassInstanceVariablesInstanceMethodX x 444
// In AnonymousInnerClassInstanceVariablesInstanceMethodX this.x 333
// In AnonymousInnerClassInstanceVariablesInstanceMethodXAnonymousInnerClassInstanceVariablesInstanceMethodX.this.x 111
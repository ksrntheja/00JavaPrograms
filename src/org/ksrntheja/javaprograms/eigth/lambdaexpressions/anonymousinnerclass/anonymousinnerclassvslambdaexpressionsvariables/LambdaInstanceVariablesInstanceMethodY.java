package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressionsvariables;

interface LambdaInstanceVariablesInstanceMethodYInterface {

    void m01();

}


public class LambdaInstanceVariablesInstanceMethodY {

    int x = 111;

    public void m02() {

        int y = 222;

        LambdaInstanceVariablesInstanceMethodYInterface lambdaInstanceVariablesInstanceMethodYInterface = // new
                // AnonymousInnerClassInstanceVariablesInstanceMethodYInterface() {

                //  int x = 333;

                // @Override
                //public void m01() {
                () -> {

                    int x = 444;
                    System.out.println("In LambdaInstanceVariablesInstanceMethodY x " + x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodY this.x " + this.x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodY y " + y);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodY" +
                            "LambdaInstanceVariablesInstanceMethodY.this.x "
                            + LambdaInstanceVariablesInstanceMethodY.this.x);
                };

        lambdaInstanceVariablesInstanceMethodYInterface.m01();

    }

    public static void main(String[] args) {

        LambdaInstanceVariablesInstanceMethodY lambdaInstanceVariablesInstanceMethodY = new
                LambdaInstanceVariablesInstanceMethodY();
        lambdaInstanceVariablesInstanceMethodY.m02();

    }
}

// In LambdaInstanceVariablesInstanceMethodY x 444
// In LambdaInstanceVariablesInstanceMethodY this.x 111
// In LambdaInstanceVariablesInstanceMethodY y 222
// In LambdaInstanceVariablesInstanceMethodYLambdaInstanceVariablesInstanceMethodY.this.x 111
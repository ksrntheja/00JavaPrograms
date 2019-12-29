package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass.anonymousinnerclassvslambdaexpressionsvariables;

interface LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface {

    void m01();

}


public class LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod {

    int x = 111;

    public void m02() {

        int y = 222;
        y++;

        LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface lambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface = // new
                // AnonymousInnerClassInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface() {

                // int x = 333;

                // @Override
                //public void m01() {
                () -> {
                    int x = 444;

                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod x " + x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod this.x " + this.x);
                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod y " + y);
                    // Variable used in lambda expression should be final or effectively final
                    // Error:(31, 119) java: local variables referenced from a lambda expression must be final or effectively final                    System.out.println("In LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod" +
                    "LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod.this.x "
                            + LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod.this.x);

                };

        lambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethodInterface.m01();

    }

    public static void main(String[] args) {


        LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod lambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod = new
                LambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod();
        lambdaInstanceVariablesInstanceMethodYIncrementInsideEnclosingMethod.m02();

    }
}

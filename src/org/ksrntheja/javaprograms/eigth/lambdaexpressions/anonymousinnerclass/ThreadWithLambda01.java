package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass;

public class ThreadWithLambda01 {

    public static void main(String args[]) {

        Runnable runnable = () ->
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("CHILD THREAD - LAMBDA");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("MAIN THREAD - LAMBDA");
        }

    }

}


/*
MAIN THREAD - LAMBDA
MAIN THREAD - LAMBDA
CHILD THREAD - LAMBDA
CHILD THREAD - LAMBDA
CHILD THREAD - LAMBDA
CHILD THREAD - LAMBDA
CHILD THREAD - LAMBDA
CHILD THREAD - LAMBDA
CHILD THREAD - LAMBDA
CHILD THREAD - LAMBDA
CHILD THREAD - LAMBDA
CHILD THREAD - LAMBDA
MAIN THREAD - LAMBDA
MAIN THREAD - LAMBDA
MAIN THREAD - LAMBDA
MAIN THREAD - LAMBDA
MAIN THREAD - LAMBDA
MAIN THREAD - LAMBDA
MAIN THREAD - LAMBDA
MAIN THREAD - LAMBDA
 */

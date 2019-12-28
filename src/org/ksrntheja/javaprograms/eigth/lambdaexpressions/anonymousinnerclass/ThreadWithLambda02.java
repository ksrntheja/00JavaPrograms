package org.ksrntheja.javaprograms.eigth.lambdaexpressions.anonymousinnerclass;

public class ThreadWithLambda02 {

    public static void main(String args[]) {

        Thread thread = new Thread(() ->
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("CHILD THREAD - LAMBDA");
            }
        });
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("MAIN THREAD - LAMBDA");
        }

    }

}

/*
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
MAIN THREAD - LAMBDA
MAIN THREAD - LAMBDA
 */
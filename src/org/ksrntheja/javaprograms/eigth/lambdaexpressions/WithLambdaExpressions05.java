package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

public class WithLambdaExpressions05 {

    public static void main(String args[]) {

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("In LAMBDA CHILD Thread");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("In MAIN Thread");
        }
    }

}


/*
In LAMBDA CHILD Thread
In LAMBDA CHILD Thread
In LAMBDA CHILD Thread
In LAMBDA CHILD Thread
In LAMBDA CHILD Thread
In LAMBDA CHILD Thread
In LAMBDA CHILD Thread
In LAMBDA CHILD Thread
In LAMBDA CHILD Thread
In LAMBDA CHILD Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
 */
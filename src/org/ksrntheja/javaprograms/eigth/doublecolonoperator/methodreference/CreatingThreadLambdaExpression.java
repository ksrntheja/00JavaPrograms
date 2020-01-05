package org.ksrntheja.javaprograms.eigth.doublecolonoperator.methodreference;

public class CreatingThreadLambdaExpression {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Lambda Child Thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Lambda Main Thread");
        }

    }

}

/*
Lambda Main Thread
Lambda Child Thread
Lambda Child Thread
Lambda Child Thread
Lambda Child Thread
Lambda Child Thread
Lambda Child Thread
Lambda Child Thread
Lambda Child Thread
Lambda Child Thread
Lambda Child Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
 */

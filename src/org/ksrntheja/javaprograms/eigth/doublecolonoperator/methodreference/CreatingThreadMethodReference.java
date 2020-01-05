package org.ksrntheja.javaprograms.eigth.doublecolonoperator.methodreference;

public class CreatingThreadMethodReference {

    public final int myRun() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Method Reference Child Thread");
        }

        return 8;
    }

    public static void main(String[] args) {

        CreatingThreadMethodReference creatingThreadMethodReference = new CreatingThreadMethodReference();

        Runnable runnable = creatingThreadMethodReference::myRun;

        // Runnable runnable = () -> creatingThreadMethodReference.myRun();

        /*
        Runnable runnable = () -> {
            creatingThreadMethodReference.myRun();
        };
        */

        /*
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                creatingThreadMethodReference.myRun();
            }
        };
        */

        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Lambda Main Thread");
        }

    }

}

/*
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Lambda Main Thread
Method Reference Child Thread
Method Reference Child Thread
Method Reference Child Thread
Method Reference Child Thread
Method Reference Child Thread
Method Reference Child Thread
Method Reference Child Thread
Method Reference Child Thread
Method Reference Child Thread
Method Reference Child Thread
Lambda Main Thread
Lambda Main Thread
 */
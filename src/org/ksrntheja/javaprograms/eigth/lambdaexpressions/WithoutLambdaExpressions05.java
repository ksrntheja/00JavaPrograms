package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

class C05 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In CHILD Thread");
        }
    }

}

public class WithoutLambdaExpressions05 {

    public static void main(String args[]) {

        Runnable runnable = new C05();
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("In MAIN Thread");
        }
    }

}


/*
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In CHILD Thread
In CHILD Thread
In CHILD Thread
In CHILD Thread
In CHILD Thread
In CHILD Thread
In CHILD Thread
In CHILD Thread
In CHILD Thread
In CHILD Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
In MAIN Thread
 */
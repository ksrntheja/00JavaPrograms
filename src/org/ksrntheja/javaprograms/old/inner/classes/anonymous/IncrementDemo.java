/*
 * (8) Inner Classes
 * (8 - 3C) Anonymous Inner Classes - increment  demo
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

public class IncrementDemo {

    public static void main(String[] args) {

        int x = 10;

        Runnable runnable = new Runnable() {
            int y = 20;
            static int z = 30;

            public void run() {
                for (int i = 0; i < 4; i++) {
                    System.out.println("Child Thread : " + ++y);
                }
//                CE: java: local variables referenced from an inner class must be final or effectively final
//                System.out.println(++x);
                System.out.println(x);
                System.out.println(++z);
            }
            // System.out.println(x); // Invalid
        };

//        System.out.println(++x); // Then CE :  local variables referenced from an inner class must be final or effectively final
        System.out.println("In main :" + x);
        Thread thread01 = new Thread(runnable);
        thread01.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("Main Thread");
        }

    }
}

/*
In main :10
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread : 21
Child Thread : 22
Child Thread : 23
Child Thread : 24
10
31
 */

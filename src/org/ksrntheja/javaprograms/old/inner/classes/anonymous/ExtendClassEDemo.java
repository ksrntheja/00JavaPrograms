/*
 * (8) Inner Classes
 * (8 - 3E) Anonymous Inner Classes - Thread Lambda
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

public class ExtendClassEDemo {

    public static void main(String[] args) {

//        Thread thread01 = () -> {
//            @Override
//            public void run() {
//
//            }
//        };

        Thread thread01 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        });

        thread01.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

    }

}

/*
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Main Thread
Main Thread
Main Thread
 */

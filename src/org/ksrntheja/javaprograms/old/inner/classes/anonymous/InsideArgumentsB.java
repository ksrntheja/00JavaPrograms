/*
 * (8) Inner Classes
 * (8 - 3A) Anonymous Inner Classes - inside arguments  - Lambda
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

public class InsideArgumentsB {

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        }).start();
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
Main Thread
Main Thread
Child Thread
 */

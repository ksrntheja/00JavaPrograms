/*
 * (8) Inner Classes
 * (8 - 3A) Anonymous Inner Classes - inside arguments
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

public class InsideArgumentsA {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
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

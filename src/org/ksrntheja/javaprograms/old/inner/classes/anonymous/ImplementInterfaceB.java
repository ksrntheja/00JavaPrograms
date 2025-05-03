/*
 * (8) Inner Classes
 * (8 - 3B) Anonymous Inner Classes - implement interface - Lambda
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

public class ImplementInterfaceB {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
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
Child Thread
Main Thread
Main Thread
 */

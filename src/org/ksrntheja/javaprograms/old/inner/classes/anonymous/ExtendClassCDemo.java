/*
 * (8) Inner Classes
 * (8 - 3C) Anonymous Inner Classes - Extend Thread class
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

public class ExtendClassCDemo {

    public static void main(String[] args) {

        Thread thread01 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };
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
Main Thread
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
Child Thread
 */

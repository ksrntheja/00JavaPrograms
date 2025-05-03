/*
 * (8) Inner Classes
 * (8 - 3D) Anonymous Inner Classes - Extend Thread class (Normal)
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }

    }
}

public class ExtendClassDDemo {

    public static void main(String[] args) {

        MyThread thread01 = new MyThread();
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

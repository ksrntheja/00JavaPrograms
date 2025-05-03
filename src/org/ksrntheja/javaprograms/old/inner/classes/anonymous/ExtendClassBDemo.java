/*
 * (8) Inner Classes
 * (8 - 3B) Anonymous Inner Classes - Extend class
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

class ExtendClassB {

    public void taste() {
        System.out.println("Salty");
    }

}

public class ExtendClassBDemo {

    public static void main(String[] args) {

        ExtendClassB obj1 = new ExtendClassB() {
        };
        obj1.taste();

    }

}

/*
Salty
 */

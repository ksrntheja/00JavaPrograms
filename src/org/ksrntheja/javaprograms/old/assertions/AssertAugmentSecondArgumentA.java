/*
 * (18) Assertions
 * 3-2-2. Augmented 'assert' statement - Evaluation of second argument
 */

package org.ksrntheja.javaprograms.old.assertions;

public class AssertAugmentSecondArgumentA {

    public static void main(String[] args) {

        int x = 10;

        assert (x == 10) : ++x;

        System.out.println(x);

    }

}

/*
Without VM Options:
    10

For VM Options: -ea
    10
 */

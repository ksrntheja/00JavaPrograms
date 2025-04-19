/*
 * (18) Assertions
 * 3-2-3. Augmented 'assert' statement - Evaluation of second argument
 */

package org.ksrntheja.javaprograms.old.assertions;

public class AssertAugmentSecondArgumentB {

    public static void main(String[] args) {

        int x = 10;

        assert (x > 10) : ++x;

        System.out.println(x);

    }

}

/*
Without VM Options:
    10

For VM Options: -ea
    Exception in thread "main" java.lang.AssertionError: 11
	    at org.ksrntheja.javaprograms.old.assertions.AssertAugmentSecondArgumentB.main(AssertAugmentSecondArgumentB.java:14)
 */

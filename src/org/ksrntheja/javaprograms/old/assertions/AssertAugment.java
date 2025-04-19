/*
 * (18) Assertions
 * 3-2-1. Augmented 'assert' statement
 */

package org.ksrntheja.javaprograms.old.assertions;

public class AssertAugment {

    public static void main(String[] args) {

        int x = 10;

        assert (x > 10) : "Here the value of x must be greater than 10, But it was not!";

        System.out.println(x);

    }

}

/*
Without VM Options:
    10

For VM Options: -ea
    Exception in thread "main" java.lang.AssertionError: Here the value of x must be greater than 10, But it was not!
        at org.ksrntheja.javaprograms.old.assertions.AssertAugment.main(AssertAugment.java:14)
 */

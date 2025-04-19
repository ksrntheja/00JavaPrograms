/*
 * (18) Assertions - Types of 'assert' statements
 * 3-1. Simple 'assert' statement
 */

package org.ksrntheja.javaprograms.old.assertions;

public class AssertSimple {

    public static void main(String[] args) {

        int x = 10;

        assert (x > 10);

        System.out.println(x);

    }

}

/*
Without VM Options:
    10

For VM Options: -ea
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.AssertSimple.main(AssertSimple.java:14)
 */

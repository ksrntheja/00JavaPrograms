/*
 * (18) Assertions - Types of 'assert' statements
 * 4. Various possible runtime flags
 */

package org.ksrntheja.javaprograms.old.assertions;

public class AssertSimpleMultipleFlags {

    public static void main(String[] args) {

        int x = 10;

        assert (x > 10);

        System.out.println(x);

    }

}

/*
Without VM Options:
    10

For VM Options: -ea -esa -da -ea -esa -da -dsa -ea
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.AssertSimpleMultipleFlags.main(AssertSimpleMultipleFlags.java:14)
 */

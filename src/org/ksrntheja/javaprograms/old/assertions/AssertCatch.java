/*
 * (18) Assertions
 * 6. AssertionError
 */

package org.ksrntheja.javaprograms.old.assertions;

public class AssertCatch {

    public static void main(String[] args) {

        int x = 10;
        try {
            assert (x > 10);
        } catch (AssertionError assertionError) {
            System.out.println(x);
        }

        boolean assertOn = false;
        assert assertOn : "assert on";

    }

}

/*
Without VM Options:

For VM Options: -ea
    10
    Exception in thread "main" java.lang.AssertionError: assert on
        at org.ksrntheja.javaprograms.old.assertions.AssertCatch.main(AssertCatch.java:20)
 */

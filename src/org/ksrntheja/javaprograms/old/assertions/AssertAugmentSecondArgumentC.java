/*
 * (18) Assertions
 * 3-2-3. Augmented 'assert' statement - method(_) as second argument
 */

package org.ksrntheja.javaprograms.old.assertions;

public class AssertAugmentSecondArgumentC {

    public static void main(String[] args) {

        int x = 10;

//        assert (x > 10) : m1();
//        CE: java: 'void' type not allowed here

        assert (x > 10) : m2();

        System.out.println(x);

    }

    public static void m1() {
        System.out.println("return nothing");
    }

    public static int m2() {
        System.out.println("return 999");
        return 999;
    }

}

/*
Without VM Options:
    10

For VM Options: -ea
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.AssertSimple.main(AssertSimple.java:<17>)
 */

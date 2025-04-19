/*
 * (18) Assertions
 * 4. Various possible runtime flags
 */

package org.ksrntheja.javaprograms.old.assertions.one.two;

import org.ksrntheja.javaprograms.old.assertions.one.AssertSimpleA;
import org.ksrntheja.javaprograms.old.assertions.one.AssertSimpleB;

public class AssertSimpleD {

    public static void main(String[] args) {

        AssertSimpleA a = new AssertSimpleA();
        AssertSimpleB b = new AssertSimpleB();
        AssertSimpleC c = new AssertSimpleC();
        AssertSimpleD d = new AssertSimpleD();
        b.m1();
        c.m1();
        d.m1();
        a.m1();

    }

    public void m1() {
        int x = 10;
        assert (x > 10);
        System.out.println("From D " + x);
    }

}

/*

-ea
        b.m1();
        a.m1();
        c.m1();
        d.m1();
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.one.AssertSimpleB.m1(AssertSimpleB.java:28)
        at org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleD.main(AssertSimpleD.java:19)

-ea:org.ksrntheja.javaprograms.old.assertions.one.AssertSimpleB
        a.m1();
        b.m1();
        c.m1();
        d.m1();
    From A 10
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.one.AssertSimpleB.m1(AssertSimpleB.java:28)
        at org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleD.main(AssertSimpleD.java:20)

-ea:org.ksrntheja.javaprograms.old.assertions.one.AssertSimpleB -ea:org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleD
        b.m1();
        d.m1();
        a.m1();
        c.m1();
    From A 10
    From C 10
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.one.AssertSimpleB.m1(AssertSimpleB.java:28)
        at org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleD.main(AssertSimpleD.java:21)

-ea:org.ksrntheja.javaprograms.old.assertions.one...
        c.m1();
        d.m1();
        a.m1();
        b.m1();
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleC.m1(AssertSimpleC.java:28)
        at org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleD.main(AssertSimpleD.java:19)

-ea:org.ksrntheja.javaprograms.old.assertions.one... -da:org.ksrntheja.javaprograms.old.assertions.one.two...
        c.m1();
        d.m1();
        a.m1();
        b.m1();
    From C 10
    From D 10
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.one.AssertSimpleA.m1(AssertSimpleA.java:28)
        at org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleD.main(AssertSimpleD.java:21)

-ea:org.ksrntheja.javaprograms.old.assertions.one... -da:org.ksrntheja.javaprograms.old.assertions.one.AssertSimpleB
        b.m1();
        c.m1();
        d.m1();
        a.m1();
    From B 10
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleC.m1(AssertSimpleC.java:28)
        at org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleD.main(AssertSimpleD.java:20)
 */

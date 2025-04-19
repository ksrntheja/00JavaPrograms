/*
 * (18) Assertions
 * 4. Various possible runtime flags
 */

package org.ksrntheja.javaprograms.old.assertions.one;

import org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleC;
import org.ksrntheja.javaprograms.old.assertions.one.two.AssertSimpleD;

public class AssertSimpleB {

    public static void main(String[] args) {

        AssertSimpleA a = new AssertSimpleA();
        AssertSimpleB b = new AssertSimpleB();
        AssertSimpleC c = new AssertSimpleC();
        AssertSimpleD d = new AssertSimpleD();
        a.m1();
        b.m1();
        c.m1();
        d.m1();

    }

    public void m1() {
        int x = 10;
        assert (x > 10);
        System.out.println("From B " + x);
    }

}

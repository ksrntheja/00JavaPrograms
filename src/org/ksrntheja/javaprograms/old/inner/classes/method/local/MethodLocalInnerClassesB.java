/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes - Declare in instance method - Access static & non-static instance members
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesB {

    int x = 10;
    static int y = 20;

    public void m() {

        class Inner {

            public void m() {
                System.out.println(x);
                System.out.println(y);
                System.out.println(++x);
                System.out.println(++y);
            }

        }

        Inner inner = new Inner();
        inner.m();

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesB outer = new MethodLocalInnerClassesB();
        outer.m();

    }

}

/*
10
20
11
21
 */

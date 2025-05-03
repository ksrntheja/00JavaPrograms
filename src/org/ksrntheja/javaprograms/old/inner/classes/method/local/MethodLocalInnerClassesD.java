/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes - Access local variables
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesD {

    int x = 10;

    public void m() {

        int y = 20;

        class Inner {

            public void m() {
                System.out.println(x);
                System.out.println(y);
                System.out.println(++x);
            }

        }

        Inner inner = new Inner();
        inner.m();

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesD outer = new MethodLocalInnerClassesD();
        outer.m();

    }

}

/*
10
20
11
 */
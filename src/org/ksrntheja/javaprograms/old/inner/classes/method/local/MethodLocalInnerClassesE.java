/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes - Increment local variables
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesE {

    int x = 10;

    public void m() {

        int y = 20;

        class Inner {

            public void m() {
                System.out.println(x);
                System.out.println(y);
                System.out.println(++x);
//                CE: java: local variables referenced from an inner class must be final or effectively final
//                System.out.println(++y);
            }

        }

        Inner inner = new Inner();
        inner.m();

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesE outer = new MethodLocalInnerClassesE();
        outer.m();

    }

}

/*
10
20
11
 */
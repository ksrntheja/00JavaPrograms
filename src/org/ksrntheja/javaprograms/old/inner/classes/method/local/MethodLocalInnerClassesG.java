/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes - Access variables
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesG {

    int a = 10;
    static int b = 20;

    public void m() {

        int c = 30;
        final int d = 40;

        class Inner {

            int e = 50;
            final int f = 60;

            public void m() {
                int g = 70;
                final int h = 80;
                System.out.println(++a);
                System.out.println(++b);
                System.out.println(c);
                // CE: java: local variables referenced from an inner class must be final or effectively final
//                ++c;
                System.out.println(d);
                System.out.println(++e);
                System.out.println(f);
                System.out.println(++g);
                System.out.println(h);
            }

        }

        Inner inner = new Inner();
        inner.m();

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesG outer = new MethodLocalInnerClassesG();
        outer.m();

    }

}

/*
11
21
30
40
51
60
71
80
 */

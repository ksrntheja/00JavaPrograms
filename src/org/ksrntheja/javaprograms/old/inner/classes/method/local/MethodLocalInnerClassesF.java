/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes - Access instance / local variables
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesF {

    int i = 10;
    static int j = 20;

    public void m() {

        int k = 30;
        final int l = 40;

        class Inner {

            public void m() {
                System.out.println(i);
                System.out.println(j);
                System.out.println(k);
                System.out.println(l);
            }

        }

        Inner inner = new Inner();
        inner.m();

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesF outer = new MethodLocalInnerClassesF();
        outer.m();

    }

}

/*
10
20
30
40
 */

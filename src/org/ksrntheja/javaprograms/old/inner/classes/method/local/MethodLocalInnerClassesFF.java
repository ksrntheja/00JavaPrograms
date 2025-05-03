/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes - static method - Access instance / local variables
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesFF {

    int i = 10;
    static int j = 20;

    public static void m() {

        int k = 30;
        final int l = 40;

        class Inner {

            public void m() {
//                CE: java: non-static variable i cannot be referenced from a static context
//                System.out.println(i);
                System.out.println(j);
                System.out.println(k);
                System.out.println(l);
            }

        }

        Inner inner = new Inner();
        inner.m();

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesFF outer = new MethodLocalInnerClassesFF();
        outer.m();

    }

}

/*
20
30
40
 */

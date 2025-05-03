/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes - static method of inner class - Access instance / local variables
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesFFF {

    int i = 10;
    static int j = 20;

    public void m() {

        int k = 30;
        final int l = 40;

        class Inner {

            public static void m() {
//                CE: java: non-static variable i cannot be referenced from a static context
//                System.out.println(i);
                System.out.println(j);
//                CE: java: non-static variable k cannot be referenced from a static context
//                System.out.println(k);
//                CE: java: non-static variable l cannot be referenced from a static context
//                System.out.println(l);
            }

        }

        Inner inner = new Inner();
        inner.m();

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesFFF outer = new MethodLocalInnerClassesFFF();
        outer.m();

    }

}

/*
20
 */

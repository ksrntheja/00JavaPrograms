/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes - Declare in static method - Access static & non-static instance members
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesC {

    int x = 10;
    static int y = 20;

    public static void m() {

        class Inner {

            public void m() {
//                CE: java: non-static variable x cannot be referenced from a static context
//                System.out.println(x);
                System.out.println(y);
//                CE: java: non-static variable x cannot be referenced from a static context
//                System.out.println(++x);
                System.out.println(++y);
            }

        }

        Inner inner = new Inner();
        inner.m();

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesC outer = new MethodLocalInnerClassesC();
        outer.m();

    }

}

/*
20
21
 */

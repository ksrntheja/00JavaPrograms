/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes - Access variables - same variable name
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesH {

    int i = 10;
    static int j = 20;

    public void m() {

        int i = 30;
        final int j = 40;

        class Inner {

            int i = 50;
            final int j = 60;

            public void m() {
                int i = 70;
                final int j = 80;
                System.out.println(++MethodLocalInnerClassesH.j);
                System.out.println(++this.i);
                System.out.println(this.j);
                System.out.println(++i);
                System.out.println(j);
            }

        }

        Inner inner = new Inner();
        inner.m();

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesH outer = new MethodLocalInnerClassesH();
        outer.m();

    }

}

/*
21
51
60
71
80
 */
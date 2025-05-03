/*
 * (8) Inner Classes
 * (8 - 4E) Static Inner Classes - Increment outer class members
 */

package org.ksrntheja.javaprograms.old.inner.classes.staticic;

public class StaticInnerClassDemoE {

    int x = 10;
    static int y = 20;

    static class Inner {
        int x = 100;
        static int y = 200;

        public void m() {
            StaticInnerClassDemoE outer = new StaticInnerClassDemoE();
            System.out.println(++outer.x + ++x);
            System.out.println(++outer.y + ++y);
        }

        public static void main(String[] args) {
            Inner inner = new Inner();
            inner.m();
        }

    }


}

/*
112
222
 */

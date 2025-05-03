/*
 * (8) Inner Classes
 * (8 - 4D) Static Inner Classes - Access outer class members
 */

package org.ksrntheja.javaprograms.old.inner.classes.staticic;

public class StaticInnerClassDemoD {

    int x = 10;
    static int y = 20;

    static class Inner {

        public void m() {
//            CE: java: non-static variable x cannot be referenced from a static context
//            System.out.println(x);
            System.out.println(++y);
            StaticInnerClassDemoD demo = new StaticInnerClassDemoD();
            System.out.println(++demo.x);
        }

        public static void main(String[] args) {
            Inner inner = new Inner();
            inner.m();
        }

    }

}

/*
21
11
 */

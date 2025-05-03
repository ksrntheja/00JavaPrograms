/*
 * (8) Inner Classes
 * (8 - 4C) Static Inner Classes - main(_)
 */

package org.ksrntheja.javaprograms.old.inner.classes.staticic;

public class StaticInnerClassDemoC {

    static class Inner {

        public static void m() {
            System.out.println("static nested inner class static method");
        }

        public static void main(String[] args) {
            Inner.m();
            m();
        }

    }

    public static void main(String[] args) {
        Inner.m();
    }


}

/*
Inner

IDE:
    static nested inner class static method
    static nested inner class static method

// package org.ksrntheja.javaprograms.eight.old.inner.classes.staticic;

javac StaticInnerClassDemoC.java

java StaticInnerClassDemoC$Inner
    static nested inner class static method
    static nested inner class static method

 */

/*
Outer
    static nested inner class static method
 */

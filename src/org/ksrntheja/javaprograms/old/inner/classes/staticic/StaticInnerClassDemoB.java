/*
 * (8) Inner Classes
 * (8 - 4B) Static Inner Classes
 */

package org.ksrntheja.javaprograms.old.inner.classes.staticic;

public class StaticInnerClassDemoB {

    static class Inner {
        public static void m() {
            System.out.println("static nested inner class static method");
        }

    }

    public static void main(String[] args) {

        Inner.m();

    }

}

/*
static nested inner class static method
 */

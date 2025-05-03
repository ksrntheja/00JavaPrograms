/*
 * (8) Inner Classes
 * (8 - 4A) Static Inner Classes
 */

package org.ksrntheja.javaprograms.old.inner.classes.staticic;

public class StaticInnerClassDemoA {

    static class Inner {
        public void m() {
            System.out.println("static nested inner class method");
        }
    }

    public static void main(String[] args) {

        Inner inner = new Inner();
        inner.m();

        StaticInnerClassDemoA.Inner innerObj = new StaticInnerClassDemoA.Inner();
        innerObj.m();


    }

}

/*
static nested inner class method
static nested inner class method
 */

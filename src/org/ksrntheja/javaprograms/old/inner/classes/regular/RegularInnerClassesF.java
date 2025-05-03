/*
 * (8) Inner Classes
 * (8 - 1F) Normal / Regular Inner Classes - Access Inner class code from outside of Outer class
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

class OuterA {

    class Inner {

        public void m() {
            System.out.println("Inner class method");
        }

    }

}

class RegularInnerClassesF {

    public static void main(String[] args) {

        OuterA outer = new OuterA();
        OuterA.Inner inner = outer.new Inner();
        inner.m();

    }

}

/*
Inner class method
 */

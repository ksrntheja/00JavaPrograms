/*
 * (8) Inner Classes
 * (8 - 1E) Normal / Regular Inner Classes - Access Inner class code from instance area of Outer class
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

class RegularInnerClassesE {

    class Inner {

        public void m() {
            System.out.println("Inner class method");
        }

    }

    public void m() {
        Inner inner = new Inner();
        inner.m();
    }

    public static void main(String[] args) {

        RegularInnerClassesE outer = new RegularInnerClassesE();
        outer.m();

    }

}

/*
Inner class method
 */

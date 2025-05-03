/*
 * (8) Inner Classes
 * (8 - 1D) Normal / Regular Inner Classes - Access Inner class code from static area of Outer class
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

class RegularInnerClassesD {

    class Inner {

        public void m() {
            System.out.println("Inner class method");
        }

    }

    public static void main(String[] args) {

        RegularInnerClassesD outer = new RegularInnerClassesD();
        RegularInnerClassesD.Inner inner01 = outer.new Inner();
        inner01.m();

        RegularInnerClassesD.Inner inner02 = new RegularInnerClassesD().new Inner();
        inner02.m();

        new RegularInnerClassesD().new Inner().m();

    }

}

/*
Inner class method
Inner class method
Inner class method
 */

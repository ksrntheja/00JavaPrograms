/*
 * (8) Inner Classes
 * (8 - 1G) Normal / Regular Inner Classes - Access non-static / static members of Outer class
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

class RegularInnerClassesG {

    int x = 10;
    static int y = 20;

    class Inner {

        public void m() {
            System.out.println(x);
            System.out.println(y);
        }

    }

    public static void main(String[] args) {

        RegularInnerClassesG outer = new RegularInnerClassesG();
        RegularInnerClassesG.Inner inner = outer.new Inner();
        inner.m();

    }

}

/*
10
20
*/

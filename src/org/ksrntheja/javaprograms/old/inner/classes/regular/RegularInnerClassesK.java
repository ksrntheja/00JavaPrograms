/*
 * (8) Inner Classes
 * (8 - 1K) Normal / Regular Inner Classes - Variables not having same name
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

class RegularInnerClassesK {

    int xOuter = 10;
    static int yOuter = 20;

    class Inner {

        int xInner = 100;
        final static int yInner = 200;

        public void m() {
            int x = 1000;
            int y = 2000;
            System.out.println(x); // 1000
            System.out.println(y); // 2000
            System.out.println(xInner); // 100
            System.out.println(yInner); // 200
            System.out.println(xOuter); // 10
            System.out.println(yOuter); // 20
        }

    }

    public static void main(String[] args) {

        RegularInnerClassesK outer = new RegularInnerClassesK();
        RegularInnerClassesK.Inner inner = outer.new Inner();
        inner.m();

    }

}

/*
1000
2000
100
200
10
20
*/

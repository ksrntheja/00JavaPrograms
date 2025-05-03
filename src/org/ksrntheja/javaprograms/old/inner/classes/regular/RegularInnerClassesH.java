/*
 * (8) Inner Classes
 * (8 - 1G) Normal / Regular Inner Classes - Access non-static / static members (same variable name) of Outer class
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

class RegularInnerClassesH {

    int x = 10;
    static int y = 20;
    static int z = 30;

    class Inner {

        int x = 100;
        final static int y = 200;
        static int z = 300;

        public void m() {
            int x = 1000;
            int y = 2000;
            int z = 3000;
            System.out.println(x); // 1000
            System.out.println(y); // 2000
            System.out.println(z); // 3000
            System.out.println(this.x); // 100
            System.out.println(this.y); // 200
            System.out.println(this.z); // 300
            System.out.println(Inner.this.x); // 100
            System.out.println(Inner.this.y); // 200
            System.out.println(Inner.this.z); // 300
            System.out.println(Inner.y); // 200
            System.out.println(Inner.z); // 300
            System.out.println(RegularInnerClassesH.this.x); // 10
            System.out.println(RegularInnerClassesH.this.y); // 20
            System.out.println(RegularInnerClassesH.this.z); // 30
            System.out.println(RegularInnerClassesH.y); // 20
            System.out.println(RegularInnerClassesH.z); // 30
        }

    }

    public static void main(String[] args) {

        RegularInnerClassesH outer = new RegularInnerClassesH();
        RegularInnerClassesH.Inner inner = outer.new Inner();
        inner.m();

    }

}

/*
1000
2000
3000
100
200
300
100
200
300
200
300
10
20
30
20
30
*/

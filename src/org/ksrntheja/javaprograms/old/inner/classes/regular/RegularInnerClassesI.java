/*
 * (8) Inner Classes
 * (8 - 1I) Normal / Regular Inner Classes - Increment non-static / static members (same variable name) of Outer class
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

class RegularInnerClassesI {

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
            System.out.println(++x); // 1001
            System.out.println(++y); // 2001
            System.out.println(++z); // 3001
            System.out.println(++this.x); // 101
//            CE: java: cannot assign a value to static final variable y
//            System.out.println(++this.y);
            System.out.println(++this.z); // 301
            System.out.println(++Inner.this.x); // 102
//            CE: java: cannot assign a value to static final variable y
//            System.out.println(++Inner.this.y);
            System.out.println(++Inner.this.z); // 302
//            CE: java: cannot assign a value to static final variable y
//            System.out.println(++Inner.y);
            System.out.println(++Inner.z); // 303
            System.out.println(++RegularInnerClassesI.this.x); // 11
            System.out.println(++RegularInnerClassesI.this.y); // 21
            System.out.println(++RegularInnerClassesI.this.z); // 31
            System.out.println(++RegularInnerClassesI.y); // 22
            System.out.println(++RegularInnerClassesI.z); // 32
        }

    }

    public static void main(String[] args) {

        RegularInnerClassesI outer = new RegularInnerClassesI();
        RegularInnerClassesI.Inner inner = outer.new Inner();
        inner.m();

    }

}

/*
1001
2001
3001
101
301
102
302
303
11
21
31
22
32
*/

/*
 * (8) Inner Classes
 * (8 - 1J) Normal class - Variables having same name
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

class RegularInnerClassesJ {

    int x = 10;
    static int y = 20;

    public void m() {
        int x = 1000;
        int y = 2000;
        System.out.println(++x);
        System.out.println(++y);
        System.out.println(++this.x);
        System.out.println(++this.y);
        System.out.println(++RegularInnerClassesJ.y);
    }

    public static void main(String[] args) {
        RegularInnerClassesJ outer = new RegularInnerClassesJ();
        outer.m();

    }

}

/*
1001
2001
11
21
22
*/

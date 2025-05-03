/*
 * (8) Inner Classes
 * (8 - 3G) Anonymous Inner Classes - Access / Increment variables inside static method
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

class ExtendClassG {

    int p = 100;
    int pop = 1000;

    ExtendClassG() {
        System.out.println("hi");
    }

    public void taste() {
        System.out.println("Salty");
    }
}

public class ExtendClassGDemo {


    int a = 10;
    static int b = 20;

    public static void m() {
        int c = 30;
        final int d = 40;
        ExtendClassG obj = new ExtendClassG() {
            int e = 50;
            final int f = 60;

            public void taste() {
                int g = 70;
                final int h = 80;
//                CE: java: non-static variable a cannot be referenced from a static context
//                System.out.println(++a);
                System.out.println(++b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(++e);
                System.out.println(f);
                System.out.println(++g);
                System.out.println(h);
                System.out.println(++p);
                System.out.println(++pop);
                System.out.println("Spicy");
            }
        };
        obj.taste();
    }

    public static void main(String[] args) {

        ExtendClassGDemo obj = new ExtendClassGDemo();
        obj.m();

    }

}

/*
hi
21
30
40
51
60
71
80
101
1001
Spicy
 */

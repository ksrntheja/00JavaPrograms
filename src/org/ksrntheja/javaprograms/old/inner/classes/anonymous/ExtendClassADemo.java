/*
 * (8) Inner Classes
 * (8 - 3A) Anonymous Inner Classes - Extend a class
 */

package org.ksrntheja.javaprograms.old.inner.classes.anonymous;

class ExtendClassA {

    ExtendClassA() {
        System.out.println("Hi");
    }

    public void taste() {
        System.out.println("Salty");
    }

    public void size() {
        System.out.println("L");
    }

    public static void main(String[] args) {
        System.out.println("ExtendClassA");
    }


}

public class ExtendClassADemo {

    public static void main(String[] args) {

        ExtendClassA obj1 = new ExtendClassA() {
            public static void main(String[] args) {
                System.out.println("obj1");
            }

            public void taste() {
                System.out.println("Spicy");
            }
        };
        obj1.taste();
        obj1.size();
        System.out.println(obj1.getClass().getName());

        ExtendClassA obj2 = new ExtendClassA();
        obj2.taste();
        obj2.size();
        System.out.println(obj2.getClass().getName());


        ExtendClassA obj3 = new ExtendClassA() {
            public void taste() {
                System.out.println("Sweet");
            }

            public void tasted() {
                System.out.println("New method");
            }

            public static void main(String[] args) {
                System.out.println("obj3");
            }
        };
        obj3.taste();
        obj3.size();

        /*
        java: cannot find symbol
            symbol:   method tasted()
            location: variable obj3 of type ExtendClassA
        obj3.tasted();
         */

        System.out.println(obj3.getClass().getName());


    }

}

/*
IDE
    Hi
    Spicy
    L
    org.ksrntheja.javaprograms.old.inner.classes.anonymous.ExtendClassADemo$1
    Hi
    Salty
    L
    org.ksrntheja.javaprograms.old.inner.classes.anonymous.ExtendClassA
    Hi
    Sweet
    L
    org.ksrntheja.javaprograms.old.inner.classes.anonymous.ExtendClassADemo$2

JAVAC
//package org.ksrntheja.javaprograms.eight.old.inner.classes.anonymous;

java ExtendClassA
    java ExtendClassA

java ExtendClassADemo
    Hi
    Spicy
    L
    ExtendClassADemo$1
    Hi
    Salty
    L
    ExtendClassA
    Hi
    Sweet
    L
    ExtendClassADemo$2

java ExtendClassADemo$1
    obj1

java ExtendClassADemo$2
    obj3

 */

/*
 * (8) Inner Classes
 * (8 - 2A) Method Local Inner Classes
 */

package org.ksrntheja.javaprograms.old.inner.classes.method.local;

public class MethodLocalInnerClassesA {

    public void m() {


//        CE: java: illegal start of expression ; IDE: Modifier 'static' not allowed here
//        static class Inner {

        class Inner {
//            final class Inner {
//        abstract class  Inner {

            int i = 10;
            static int z = 100;

            public static void sum(int x, int y) {
                System.out.println(++z);
            }

            public void sumDynamic(int x, int y) {
                System.out.println(x + y + ++i + ++z);
            }

            public static void main(String[] args) {
                System.out.println("main(_) of Method Local Inner Class");
            }

        }

        Inner inner = new Inner();
        inner.sumDynamic(10, 20);
        inner.sumDynamic(100, 200);
        inner.sumDynamic(1000, 2000);
        inner.sum(10, 20);
        inner.sum(100, 200);
        inner.sum(1000, 2000);

    }

    public static void main(String[] args) {

        MethodLocalInnerClassesA outer = new MethodLocalInnerClassesA();
        outer.m();

    }

}

/*
142
414
3116
104
105
106

// package org.ksrntheja.javaprograms.old.inner.classes.method.local;
java MethodLocalInnerClassesA$1Inner
    MethodLocalInnerClassesA$1Inner
 */

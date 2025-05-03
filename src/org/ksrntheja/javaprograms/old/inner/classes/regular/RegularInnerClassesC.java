/*
 * (8) Inner Classes
 * (8 - 1C) Normal / Regular Inner Classes - Adding main(_) in Inner
 */

package org.ksrntheja.javaprograms.old.inner.classes.regular;

class RegularInnerClassesC {

    class Inner {

        Inner() {
            System.out.println("RegularInnerClassesC$Inner");
        }

        static int staticField = 10; // Valid in Java 16 and later
        static String STRING = "Hi";
        String string = "Hello";

        static {
            System.out.println("RegularInnerClassesC$Inner static{}");
        }

        {
            System.out.println("RegularInnerClassesC$Inner {}");
        }

        public static void main(String[] args) {
            System.out.println("RegularInnerClassesC$Inner main(_)");
            System.out.println(staticField);
            System.out.println(STRING);
        }

        public void m() {
            System.out.println(string);
        }

    }

    public static void main(String[] args) {

        System.out.println("RegularInnerClassesC main(_)");
        System.out.println(Inner.staticField);
        System.out.println(Inner.STRING);
        RegularInnerClassesC outer = new RegularInnerClassesC();
        RegularInnerClassesC.Inner inner = outer.new Inner();
        inner.m();

    }

    RegularInnerClassesC() {
        System.out.println("RegularInnerClassesC");
    }

    static {
        System.out.println("RegularInnerClassesC static{}");
    }

    {
        System.out.println("RegularInnerClassesC {}");
    }

}
/*
// package org.ksrntheja.javaprograms.eight.old.inner.classes;

javac RegularInnerClassesC.java

java RegularInnerClassesC
    RegularInnerClassesC static{}
    RegularInnerClassesC main(_)
    RegularInnerClassesC$Inner static{}
    10
    Hi
    RegularInnerClassesC {}
    RegularInnerClassesC
    RegularInnerClassesC$Inner {}
    RegularInnerClassesC$Inner
    Hello

java RegularInnerClassesC$Inner
    RegularInnerClassesC$Inner static{}
    RegularInnerClassesC$Inner main(_)
    10
    Hi

 */

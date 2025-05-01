/*
 * (09) Garbage Collector
 * (09 - 4 - 8) finalize vs catch.
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

public class FinalizeDemo08 {

    public static void main(String[] args) {

        FinalizeDemo08 finalizeDemo = new FinalizeDemo08();
        finalizeDemo = null;
        System.gc();
        System.out.println("End of main(_)");

    }

    @Override
    public void finalize() {
        System.out.println("Start finalize(_)");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("ArithmeticException");
        }
        System.out.println("End finalize(_)");
    }

}

/*
End of main(_)
Start finalize(_)
ArithmeticException
End finalize(_)
 */

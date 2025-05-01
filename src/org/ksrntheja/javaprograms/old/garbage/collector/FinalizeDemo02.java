/*
 * (09) Garbage Collector
 * (09 - 4 - 2) finalize - Executed on Object eligible for GC.
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

public class FinalizeDemo02 {

    public static void main(String[] args) {

        FinalizeDemo02 finalizeDemo = new FinalizeDemo02();
        finalizeDemo = null;
        System.gc();
        System.out.println("End of main(_)");

    }

    @Override
    public void finalize() {
        System.out.println("In finalize(_)");
    }

}

/*
End of main(_)
In finalize(_)
 */

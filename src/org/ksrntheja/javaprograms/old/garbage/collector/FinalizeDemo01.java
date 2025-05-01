/*
 * (09) Garbage Collector
 * (09 - 4 - 1) finalize - Executed on Object eligible for GC.
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

public class FinalizeDemo01 {

    public static void main(String[] args) {

        String string = new String("Java");
        string = null;
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
 */

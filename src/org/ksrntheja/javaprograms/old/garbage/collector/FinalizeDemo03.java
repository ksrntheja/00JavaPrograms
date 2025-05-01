/*
 * (09) Garbage Collector
 * (09 - 4 - 3) finalize - Executed explicitly.
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

public class FinalizeDemo03 {

    public static void main(String[] args) {

        FinalizeDemo03 finalizeDemo = new FinalizeDemo03();
        finalizeDemo.finalize();
        finalizeDemo.finalize();
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
In finalize(_)
In finalize(_)
End of main(_)
In finalize(_)
 */

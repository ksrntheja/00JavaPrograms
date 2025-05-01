/*
 * (09) Garbage Collector
 * (09 - 4 - 4) finalize vs Exception.
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

public class FinalizeDemo04 {

    public static void main(String[] args) {

        FinalizeDemo04 finalizeDemo = new FinalizeDemo04();
//        finalizeDemo.finalize();
        finalizeDemo = null;
        System.gc();
        System.out.println("End of main(_)");

    }

    @Override
    public void finalize() {
        System.out.println("Start finalize(_)");
        System.out.println(10 / 0);
        System.out.println("End finalize(_)");
    }

}

/*
End of main(_)
Start finalize(_)
 */

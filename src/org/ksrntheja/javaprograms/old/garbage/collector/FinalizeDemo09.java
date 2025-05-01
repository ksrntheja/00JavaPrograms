/*
 * (09) Garbage Collector
 * (09 - 4 - 9) finalize called only once.
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

public class FinalizeDemo09 {

    static FinalizeDemo09 staticFinalizeDemo;

    public static void main(String[] args) throws InterruptedException {

        FinalizeDemo09 finalizeDemo = new FinalizeDemo09();
        System.out.println(finalizeDemo.hashCode());
        finalizeDemo = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(staticFinalizeDemo.hashCode());
        staticFinalizeDemo = null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("End of main(_)");

    }

    @Override
    public void finalize() {
        System.out.println("Start finalize(_)");
        staticFinalizeDemo = this;
    }

}

/*
2065951873
Start finalize(_)
2065951873
End of main(_)
 */

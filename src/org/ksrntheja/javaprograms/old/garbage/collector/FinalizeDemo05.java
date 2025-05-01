/*
 * (09) Garbage Collector
 * (09 - 4 - 5) finalize vs Exception.
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

public class FinalizeDemo05 {

    public static void main(String[] args) {

        FinalizeDemo05 finalizeDemo = new FinalizeDemo05();
        finalizeDemo.finalize();
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
Start finalize(_)
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at org.ksrntheja.javaprograms.old.garbage.collector.FinalizeDemo05.finalize(FinalizeDemo05.java:23)
	at org.ksrntheja.javaprograms.old.garbage.collector.FinalizeDemo05.main(FinalizeDemo05.java:13)
 */

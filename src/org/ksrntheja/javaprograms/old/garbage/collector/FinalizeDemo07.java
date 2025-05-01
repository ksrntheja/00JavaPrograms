/*
 * (09) Garbage Collector
 * (09 - 4 - 7) finalize vs throw.
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

public class FinalizeDemo07 {

    public static void main(String[] args) {

        FinalizeDemo07 finalizeDemo = new FinalizeDemo07();
        finalizeDemo.finalize();
        finalizeDemo = null;
        System.gc();
        System.out.println("End of main(_)");

    }

    @Override
    public void finalize() {
        System.out.println("Start finalize(_)");
        throw new RuntimeException("RuntimeException");
        // CE: java: unreported exception java.io.IOException; must be caught or declared to be thrown
//        throw new IOException("IOException");
        // CE: java: unreachable statement
//        System.out.println("End finalize(_)");
    }

}

/*
Start finalize(_)
Exception in thread "main" java.lang.RuntimeException: RuntimeException
	at org.ksrntheja.javaprograms.old.garbage.collector.FinalizeDemo07.finalize(FinalizeDemo07.java:23)
	at org.ksrntheja.javaprograms.old.garbage.collector.FinalizeDemo07.main(FinalizeDemo07.java:13)
 */

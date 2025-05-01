/*
 * (09) Garbage Collector
 * (09 - 4 - 6) finalize vs throw.
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

import java.io.IOException;

public class FinalizeDemo06 {

    public static void main(String[] args) {

        FinalizeDemo06 finalizeDemo = new FinalizeDemo06();
//        finalizeDemo.finalize();
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
End of main(_)
Start finalize(_)
 */

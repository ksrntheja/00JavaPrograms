/*
 * (09) Garbage Collector
 * (09 - 2 - 2) Runtime GC
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

import java.util.Date;

public class RuntimeDemo {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory -> " + runtime.totalMemory() / (1024 * 1024));
        System.out.println("Free Memory -> " + runtime.freeMemory() / (1024 * 1024));
        for (int i = 0; i < 100000; i++) {
            Date date = new Date();
            date = null;
        }
        System.out.println("Free Memory -> " + runtime.freeMemory() / (1024 * 1024));
        runtime.gc();
        System.out.println("Free Memory -> " + runtime.freeMemory() / (1024 * 1024));

    }

}

/*
Total Memory -> 128
Free Memory -> 124
Free Memory -> 122
Free Memory -> 9
 */

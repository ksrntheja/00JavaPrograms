/*
 * (20) JVM architecture
 * Heap area of JVM
 */

package org.ksrntheja.javaprograms.old.jvm.architecture;

public class HeapAreaDemo {

    public static void main(String[] args) {

        long mb = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Max memory -> " + runtime.maxMemory() / mb);
        System.out.println("Total memory -> " + runtime.totalMemory() / mb);
        System.out.println("Free memory -> " + runtime.freeMemory() / mb);
        System.out.println("Consumed memory -> " + (runtime.totalMemory() - runtime.freeMemory()) / mb);

    }


}
/*
Without VM Options:
    Max memory -> 2018
    Total memory -> 128
    Free memory -> 124
    Consumed memory -> 3

For VM Options: -Xmx128m
    Max memory -> 128
    Total memory -> 128
    Free memory -> 124
    Consumed memory -> 3

For VM Options: -Xms64m
    Max memory -> 2018
    Total memory -> 64
    Free memory -> 60
    Consumed memory -> 3

For VM Options: -Xmx128m -Xms64m
    Max memory -> 128
    Total memory -> 64
    Free memory -> 60
    Consumed memory -> 3

 */

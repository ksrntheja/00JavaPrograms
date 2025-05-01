/*
 * (09) Garbage Collector
 * (09 - 1) Island of Isolation
 */

package org.ksrntheja.javaprograms.old.garbage.collector;

public class IslandOfIsolation {

    IslandOfIsolation island;

    public static void main(String[] args) {

        IslandOfIsolation island01 = new IslandOfIsolation();
        IslandOfIsolation island02 = new IslandOfIsolation();
        IslandOfIsolation island03 = new IslandOfIsolation();

        island01.island = island02;
        island02.island = island03;
        island03.island = island01;

        island01 = null;
        island02 = null;
        island03 = null;

    }

}

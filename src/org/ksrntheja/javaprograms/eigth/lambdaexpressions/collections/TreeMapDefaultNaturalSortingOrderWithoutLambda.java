package org.ksrntheja.javaprograms.eigth.lambdaexpressions.collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDefaultNaturalSortingOrderWithoutLambda {

    public static void main(String args[]) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(100, "THEJA");
        treeMap.put(10, "THEJAK");
        treeMap.put(200, "THEJA08");
        treeMap.put(800, "THEJA8");
        treeMap.put(300, "THEJA");
        treeMap.put(100, "THEJAKSRN");
        System.out.println("TreeMap : " + treeMap);
    }

}

package org.ksrntheja.javaprograms.eigth.lambdaexpressions.collections;

import java.util.TreeMap;

public class TreeMapCustomSortingOrderLambda {

    public static void main(String args[]) {

        TreeMap<Integer, String> treeMap = new TreeMap<>((integer01, integer02) -> integer01 > integer02 ? -1 : integer01 < integer02 ? 1 : 0);
        treeMap.put(100, "THEJA");
        treeMap.put(10, "THEJAK");
        treeMap.put(200, "THEJA08");
        treeMap.put(800, "THEJA8");
        treeMap.put(300, "THEJA");
        treeMap.put(100, "THEJAKSRN");
        System.out.println("TreeMap : " + treeMap);
    }

}

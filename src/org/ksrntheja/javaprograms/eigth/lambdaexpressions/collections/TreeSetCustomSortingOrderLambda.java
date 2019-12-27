package org.ksrntheja.javaprograms.eigth.lambdaexpressions.collections;

import java.util.TreeSet;

public class TreeSetCustomSortingOrderLambda {

    public static void main(String args[]) {

        TreeSet<Integer> treeSet = new TreeSet<>((integer01, integer02) -> integer01 > integer02 ? -1 : integer01 < integer02 ? 1 : 0);
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        System.out.println("TreeSet : " + treeSet);
    }

}

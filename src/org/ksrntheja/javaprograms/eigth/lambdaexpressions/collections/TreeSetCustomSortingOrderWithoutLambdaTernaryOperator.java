package org.ksrntheja.javaprograms.eigth.lambdaexpressions.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustomSortingOrderWithoutLambdaTernaryOperator {

    public static void main(String args[]) {

        TreeSet<Integer> treeSet = new TreeSet<>(new MyComparatorTernaryOpTreeSet());
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        System.out.println("TreeSet : " + treeSet);
    }

}

class MyComparatorTernaryOpTreeSet implements Comparator<Integer> {

    @Override
    public int compare(Integer integer01, Integer integer02) {
        return integer01 > integer02 ? -1 : integer01 < integer02 ? 1 : 0;
    }

}

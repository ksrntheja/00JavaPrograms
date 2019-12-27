package org.ksrntheja.javaprograms.eigth.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListCustomSortingOrderWithoutLambdaTernaryOperator {

    public static void main(String args[]) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(0);
        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(15);
        System.out.println("Before Sorting : " + arrayList);
        Collections.sort(arrayList, new MyComparatorTernaryOp());
        System.out.println("Before Sorting : " + arrayList);
    }

}

class MyComparatorTernaryOp implements Comparator<Integer> {

    @Override
    public int compare(Integer integer01, Integer integer02) {
        return integer01 > integer02 ? -1 : integer01 < integer02 ? 1 : 0;
    }

}

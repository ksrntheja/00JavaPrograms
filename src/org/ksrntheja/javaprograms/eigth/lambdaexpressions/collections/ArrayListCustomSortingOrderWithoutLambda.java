package org.ksrntheja.javaprograms.eigth.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListCustomSortingOrderWithoutLambda {

    public static void main(String args[]) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(0);
        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(15);
        System.out.println("Before Sorting : " + arrayList);
        Collections.sort(arrayList, new MyComparator());
        System.out.println("Before Sorting : " + arrayList);
    }

}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer integer01, Integer integer02) {
        if (integer01 > integer02) {
            return -1;
        } else if (integer01 < integer02) {
            return 1;
        } else {
            return 0;
        }
    }

}

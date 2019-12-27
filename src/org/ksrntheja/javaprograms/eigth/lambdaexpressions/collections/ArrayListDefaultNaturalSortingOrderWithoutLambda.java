package org.ksrntheja.javaprograms.eigth.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDefaultNaturalSortingOrderWithoutLambda {

    public static void main(String args[]) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(0);
        arrayList.add(15);
        arrayList.add(5);
        arrayList.add(20);
        System.out.println("Before Sorting : " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Before Sorting : " + arrayList);
    }

}

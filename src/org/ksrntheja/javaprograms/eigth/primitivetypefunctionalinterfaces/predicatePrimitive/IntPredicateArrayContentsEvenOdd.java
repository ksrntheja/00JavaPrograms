package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces.predicatePrimitive;

import java.util.function.IntPredicate;

public class IntPredicateArrayContentsEvenOdd {

    public static void main(String[] args) {

        IntPredicate evenOddIntPredicate = integer -> integer % 2 == 0;

        int[] numbers = {1, 2, 3, 4, 5};

        long currentTime = System.currentTimeMillis();

        for (int i : numbers) {
            System.out.println("Number " + i + " is Even : " + evenOddIntPredicate.test(i));
        }

        System.out.println("Total Time : " + (System.currentTimeMillis() - currentTime));

    }

}

/*
Number 1 is Even : false
Number 2 is Even : true
Number 3 is Even : false
Number 4 is Even : true
Number 5 is Even : false
Total Time : 30
 */

package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces.whatstheneed;

import java.util.function.Predicate;

public class PredicateArrayContentsEvenOddTime {

    public static void main(String[] args) {

        Predicate<Integer> evenOddPredicate = integer -> integer % 2 == 0;

        int[] numbers = {1, 2, 3, 4, 5};

        long currentTime = System.currentTimeMillis();

        for (int i : numbers) {
            System.out.println("Number " + i + " is Even : " + evenOddPredicate.test(i));
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
Total Time : 35
 */

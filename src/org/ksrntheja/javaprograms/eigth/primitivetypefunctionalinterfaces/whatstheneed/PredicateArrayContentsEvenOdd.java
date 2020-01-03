package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces.whatstheneed;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateArrayContentsEvenOdd {

    public static void main(String[] args) {

        // Predicate<int> evenOddPredicate = integer -> integer % 2 == 0;
        // Type argument cannot be of primitive type

        Predicate<Integer> evenOddPredicate = integer -> integer % 2 == 0;

        Function<Integer, Integer> squareFunction = integer -> integer * integer;

        int[] numbers = {1, 2, 3, 4, 5};

        for (int i : numbers) {
            System.out.println("Number " + i + " is Even : " + evenOddPredicate.test(i));
        }

        System.out.println("Square of 10 : " + squareFunction.apply(10));

    }

}

/*
Number 1 is Even : false
Number 2 is Even : true
Number 3 is Even : false
Number 4 is Even : true
Number 5 is Even : false
Square of 10 : 100
 */

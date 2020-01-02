package org.ksrntheja.javaprograms.eigth.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateSumEven {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> integerBiPredicate = (integer01, integer02) -> (integer01 + integer02) % 2 == 0;

        System.out.println("Sum of 8 & 80 is even : " + integerBiPredicate.test(8, 80));
        System.out.println("Sum of 8 & 35 is even : " + integerBiPredicate.test(8, 35));

    }

}

// Sum of 8 & 80 is even : true
// Sum of 8 & 35 is even : false
package org.ksrntheja.javaprograms.eigth.predicate.joins;

import java.util.function.Predicate;

public class PredicateJoins {

    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> integerPredicate01 = i -> i > 10;
        Predicate<Integer> integerPredicate02 = i -> i % 2 == 0;
        System.out.println("The Numbers Greater Than 10:");
        m1(integerPredicate01, x);
        System.out.println("The Even Numbers Are:");
        m1(integerPredicate02, x);
        System.out.println("The Numbers Not Greater Than 10:");
        m1(integerPredicate01.negate(), x);
        System.out.println("The Numbers Greater Than 10 And Even Are:");
        m1(integerPredicate01.and(integerPredicate02), x);
        System.out.println("The Numbers Greater Than 10 AND Even AND DIVISIBLE BY 20:");
        m1(integerPredicate01.and(integerPredicate02).and(i -> i % 20 == 0), x);
        System.out.println("The Numbers Greater Than 10 OR Even:");
        m1(integerPredicate01.or(integerPredicate02), x);
    }

    public static void m1(Predicate<Integer> p, int[] x) {
        for (int x1 : x) {
            if (p.test(x1))
                System.out.println(x1);
        }
    }

}

/*
The Numbers Greater Than 10:
15
20
25
30
The Even Numbers Are:
0
10
20
30
The Numbers Not Greater Than 10:
0
5
10
The Numbers Greater Than 10 And Even Are:
20
30
The Numbers Greater Than 10 AND Even AND DIVISIBLE BY 20:
20
The Numbers Greater Than 10 OR Even:
0
10
15
20
25
30
 */

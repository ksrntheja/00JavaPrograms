package org.ksrntheja.javaprograms.eigth.predicate;

import java.util.function.Predicate;

public class WithPredicateLengthGr5 {

    public static void main(String args[]) {

        Predicate<String> stringPredicate = string -> string.length() > 5;
        System.out.println(stringPredicate.test("THEJA"));
        System.out.println(stringPredicate.test("KSRNTHEJA"));

    }

}

// false
// true

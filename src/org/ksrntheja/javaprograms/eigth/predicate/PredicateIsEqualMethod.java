package org.ksrntheja.javaprograms.eigth.predicate;

import java.util.function.Predicate;

public class PredicateIsEqualMethod {

    public static void main(String[] args) {

        Predicate<String> stringPredicate = Predicate.isEqual("THEJA");

        System.out.println(stringPredicate.test("THEJA"));
        System.out.println(stringPredicate.test("Theja"));
        System.out.println(stringPredicate.test("KSRN"));

    }

}

// true
// false
// false

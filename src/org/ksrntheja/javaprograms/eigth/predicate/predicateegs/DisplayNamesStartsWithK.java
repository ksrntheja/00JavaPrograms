package org.ksrntheja.javaprograms.eigth.predicate.predicateegs;

import java.util.function.Predicate;

public class DisplayNamesStartsWithK {

    public static void main(String[] args) {

        String[] names = {"Sunny", "Kajal", "Mallika", "Katrina", "Kareena"};

        Predicate<String> stringPredicate = string -> string.charAt(0) == 'K';

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Names starting with 'K' :");

        for (String name : names) {
            if (stringPredicate.test(name)) {
                System.out.println(name);
            }
        }

    }

}

/*
Sunny
Kajal
Mallika
Katrina
Kareena
Names starting with 'K' :
Kajal
Katrina
Kareena
 */

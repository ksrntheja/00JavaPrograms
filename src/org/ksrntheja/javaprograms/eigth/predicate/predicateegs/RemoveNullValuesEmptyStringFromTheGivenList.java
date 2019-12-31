package org.ksrntheja.javaprograms.eigth.predicate.predicateegs;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullValuesEmptyStringFromTheGivenList {

    public static void main(String[] args) {

        Predicate<String> stringPredicate = string -> string != null && string.length() != 0;

        String[] names = {"Durga", "", null, "Ravi", "", "Shiva", null};

        ArrayList<String> strings = new ArrayList<>();

        for (String name : names) {
            if (stringPredicate.test(name)) {
                strings.add(name);
            }
        }

        System.out.println("List of valid names : " + strings);

    }

}

// List of valid names : [Durga, Ravi, Shiva]
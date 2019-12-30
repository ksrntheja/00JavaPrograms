package org.ksrntheja.javaprograms.eigth.predicate;

import java.util.*;
import java.util.function.Predicate;

public class WithPredicateCollectionObjectIsEmpty {

    public static void main(String args[]) {

        Predicate<Collection> collectionPredicate = collection -> collection.isEmpty();
        System.out.println(collectionPredicate.test(new ArrayList<Integer>()));
        System.out.println(collectionPredicate.test(new HashSet<String>()));
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add(1);
        System.out.println(arrayList + " -> " + collectionPredicate.test(arrayList));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strings = Arrays.asList("1", "2");
        System.out.println(integers + " -> " + collectionPredicate.test(integers));
        System.out.println(strings + " -> " + collectionPredicate.test(strings));

        ArrayList arrayList02 = new ArrayList(integers);
        System.out.println(arrayList02 + " : " + arrayList02.size() + " -> " + collectionPredicate.test(arrayList02));


        // System.out.println(collectionPredicate.test(new TreeMap<Integer, Integer>()));

    }

}

// true
// true
// [A, 1] -> false
// [1, 2, 3, 4, 5] -> false
// [1, 2] -> false
// [1, 2, 3, 4, 5] : 5 -> false

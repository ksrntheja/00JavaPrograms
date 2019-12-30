package org.ksrntheja.javaprograms.eigth.predicate;

public class WithoutPredicate {

    public boolean test(Integer integer) {

        if (integer > 10) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {

        WithoutPredicate withoutPredicate = new WithoutPredicate();
        System.out.println(withoutPredicate.test(8));

    }

}

// false

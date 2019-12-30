package org.ksrntheja.javaprograms.eigth.predicate;

import java.util.function.Predicate;

public class WithPredicate {

      /*
              (Integer integer)->

            {

                if (integer > 10) {
                    return true;
                } else {
                    return false;
                }

            }
    */

    // integer -> integer >10


    public static void main(String args[]) {

        Predicate<Integer> integerPredicate = integer -> integer > 10;
        System.out.println(integerPredicate.test(8));
        System.out.println(integerPredicate.test(80));
        // System.out.println(integerPredicate.test("Theja"));
        // Error:(29, 50) java: incompatible types: java.lang.String cannot be converted to java.lang.Integer
        // System.out.println(integerPredicate.test(true));
        // Error:(31, 50) java: incompatible types: boolean cannot be converted to java.lang.Integer

    }

}

// false
// true

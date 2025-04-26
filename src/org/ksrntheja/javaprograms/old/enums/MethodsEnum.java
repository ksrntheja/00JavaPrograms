/*
 * (17) Enum
 * (4 - 1) java.lang.Enum
 */

package org.ksrntheja.javaprograms.old.enums;

public class MethodsEnum {

    public static void main(String[] args) {

        Beer[] beers = Beer.values();
        for (Beer beer : beers) {
            System.out.println(beer + "..." + beer.ordinal());
        }

        System.out.println(Beer.valueOf(Beer.class, "RC"));

//        System.out.println(Beer.valueOf(Beer.class, "NONE"));
//         RE: Exception in thread "main" java.lang.IllegalArgumentException: No enum constant org.ksrntheja.javaprograms.old.enums.Beer.NONE

        System.out.println(beers[0].getDeclaringClass());
        System.out.println(Beer.valueOf(Beer.class, "RC").name());

    }

}

/*
KF...0
KO...1
RC...2
FO...3
RC
class org.ksrntheja.javaprograms.old.enums.Beer
RC
 */

/*
 * (17) Enum
 * (6 - 1) Constructor for Enum
 */

package org.ksrntheja.javaprograms.old.enums;

public class ConstructorEnum {

    public static void main(String[] args) {

    }

}

enum BeerConstructor {

    KF, KO, RC, FO;

    BeerConstructor() {
        System.out.println("constructor");
    }

}

class ConstructorEnumDemo01 {

    public static void main(String[] args) {

        BeerConstructor beerConstructor = BeerConstructor.KF;
        System.out.println("main(_)");

    }

}
/*
constructor
constructor
constructor
constructor
main(_)
 */

class ConstructorEnumDemo02 {

    public static void main(String[] args) {

        System.out.println("main(_)");

//        CE: java: enum classes may not be instantiated
//        BeerConstructor beerConstructor = new BeerConstructor();

    }

}
/*
main(_)
 */

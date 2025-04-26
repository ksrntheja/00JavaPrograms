/*
 * (17) Enum
 * (5 - 1) Speciality
 */

package org.ksrntheja.javaprograms.old.enums;

public class SpecialityEnum {
}

enum Fish01 {

    STAR, GUPPY, GOLD;

    public static void main(String[] args) {

        System.out.println("Enum main(_)");
        System.out.println(STAR);

//        CE:
//        java: cannot find symbol
//            symbol:   variable STARR
//            location: class org.ksrntheja.javaprograms.old.enums.Fish01
//        System.out.println(STARR);

    }

}

/*
enum Fish02 {

    CE: java: enum constant expected here

    public static void main(String[] args) {
        System.out.println("Enum main(_)");
    }

}
 */

enum Fish03 {

    STAR, GUPPY, GOLD;

    public void m() {
        System.out.println("Enum m(_)");
    }

}

/*
enum Fish04 {

    CE: java: ',', '}', or ';' expected
    STAR, GUPPY, GOLD

    public void m() {
        System.out.println("Enum m(_)");
    }

}
 */

/*
enum Fish05 {

    CE: java: enum constant expected here

    public void m() {
        System.out.println("Enum m(_)");
    }

    STAR, GUPPY, GOLD;

}
 */

/*
enum Fish06 {

    CE: java: enum constant expected here

    public void m() {
        System.out.println("Enum m(_)");
    }

}
 */

enum Fish07 {

    ;

    public void m() {
        System.out.println("Enum m(_)");
    }

}

enum Fish08 {

}

/*
Enum main(_)
STAR
 */

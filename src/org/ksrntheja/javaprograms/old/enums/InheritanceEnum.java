/*
 * (17) Enum
 * (3 - 1) Inheritance
 */

package org.ksrntheja.javaprograms.old.enums;

public class InheritanceEnum {

    public static void main(String[] args) {

        enum E1 {
            ONE;
        }

//        enum E2 extends E1 {
//            TWO;
//        }

//        enum E3 extends Enum {
//            ONE;
//        }

    }
}

class EnumTest {
}

//enum E extends EnumTest {
//    ONE;
//}

enum E {
    ONE;
}

//class EnumTestExtend extends E {
//}

//enum E4 extends Enum {
//    ONE;
//}


interface I1 {
}

interface I2 {
}

enum EI1I2 implements I1, I2 {

}

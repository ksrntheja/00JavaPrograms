/*
 * (17) Enum
 * (1 - 1) Usage
 */

package org.ksrntheja.javaprograms.old.enums;

enum Beer {
    KF, KO, RC, FO;
}

public class UsageEnum {

    public static void main(String[] args) {

        Beer beer = Beer.RC;
        System.out.println(beer);

    }
}

/*
RC
 */

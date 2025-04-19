/*
 * (18) Assertions
 * 5. Appropriate & inappropriate use of assertions
 */

package org.ksrntheja.javaprograms.old.assertions;

import java.util.Scanner;

public class AssertUsage {

    public static void main(String[] args) {

//        assert args.length > 3; // inappropriate

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            default:
                assert (false); // appropriate
        }

    }
}

/*
Without VM Options:
    0


For VM Options: -ea
    0
    Exception in thread "main" java.lang.AssertionError
        at org.ksrntheja.javaprograms.old.assertions.AssertUsage.main(AssertUsage.java:27)
 */

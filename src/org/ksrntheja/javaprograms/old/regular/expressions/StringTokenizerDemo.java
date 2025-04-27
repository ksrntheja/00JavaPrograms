/*
 * (13) Regular Expressions
 * (13 - 7) StringTokenizer
 */

package org.ksrntheja.javaprograms.old.regular.expressions;

import java.util.StringTokenizer;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class StringTokenizerDemo {

    public static void main(String[] args) {

        separator("StringTokenizer default \\s");
        StringTokenizer stringTokenizer = new StringTokenizer("Oracle India Pvt Ltd");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        separator("StringTokenizer -");
        stringTokenizer = new StringTokenizer("Oracle-India-Pvt-Ltd", "-");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        separator("\\.");
        stringTokenizer =  new StringTokenizer("www.oracle.com", "\\.");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

    }

}
/*
====================================================================================
StringTokenizer default \s
====================================================================================
Oracle
India
Pvt
Ltd
====================================================================================
StringTokenizer -
====================================================================================
Oracle
India
Pvt
Ltd
====================================================================================
\.
====================================================================================
www
oracle
com
 */

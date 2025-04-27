/*
 * (13) Regular Expressions
 * (13 - 5) Pattern Class Split Method
 */

package org.ksrntheja.javaprograms.old.regular.expressions;

import java.util.regex.Pattern;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class PatternClassSplitMethod {

    public static void main(String[] args) {

        separator("\\s");
        Pattern pattern = Pattern.compile("\\s");
        String[] words = pattern.split("Oracle India Pvt Ltd");
        for (String word : words) {
            System.out.println(word);
        }

        separator("a");
        pattern = Pattern.compile("a");
        words = pattern.split("Oracle India Pvt Ltd");
        for (String word : words) {
            System.out.println(word);
        }

        separator("\\.");
        pattern = Pattern.compile("\\.");
        words = pattern.split("www.oracle.com");
        for (String word : words) {
            System.out.println(word);
        }

        separator(".");
        // CE: java: illegal escape character
//        pattern = Pattern.compile("\.");
        pattern = Pattern.compile(".");
        words = pattern.split("www.oracle.com");
        for (String word : words) {
            System.out.println(word);
        }

        separator("[.]");
        pattern = Pattern.compile("[.]");
        words = pattern.split("www.oracle.com");
        for (String word : words) {
            System.out.println(word);
        }

    }

}
/*
====================================================================================
\s
====================================================================================
Oracle
India
Pvt
Ltd
====================================================================================
a
====================================================================================
Or
cle Indi
 Pvt Ltd
====================================================================================
\.
====================================================================================
www
oracle
com
====================================================================================
.
====================================================================================
====================================================================================
[.]
====================================================================================
www
oracle
com
 */

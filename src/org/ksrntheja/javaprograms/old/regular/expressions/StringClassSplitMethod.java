/*
 * (13) Regular Expressions
 * (13 - 6) String Class Split Method
 */

package org.ksrntheja.javaprograms.old.regular.expressions;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class StringClassSplitMethod {

    public static void main(String[] args) {

        separator("\\s");
        String string = "Oracle India Pvt Ltd";
        String[] words = string.split("\\s");
        for (String word : words) {
            System.out.println(word);
        }

        separator("a");
        string = "Oracle India Pvt Ltd";
        words = string.split("a");
        for (String word : words) {
            System.out.println(word);
        }

        separator("\\.");
        string = "www.oracle.com";
        words = string.split("\\.");
        for (String word : words) {
            System.out.println(word);
        }

        separator(".");
        // CE: java: illegal escape character
//        words = string.split("\.");
        string = "www.oracle.com";
        words = string.split(".");
        for (String word : words) {
            System.out.println(word);
        }

        separator("[.]");
        string = "www.oracle.com";
        words = string.split("[.]");
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

/*
 * (18) Assertions
 * 2. 'assert' as keyword & identifier
 */

package org.ksrntheja.javaprograms.old.assertions;

public class AssertAsKeyword {

    public static void main(String[] args) {

//        int assert =10;
//        CE: java: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier

//        System.out.println( assert);

    }

}

/*

// package org.ksrntheja.javaprograms.old.assertions;

javac AssertAsKeyword.java
    AssertAsKeyword.java:12: error: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
            int assert =10;
                ^
      (use -source 1.3 or lower to use 'assert' as an identifier)
    AssertAsKeyword.java:15: error: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
            System.out.println(assert);
                               ^
      (use -source 1.3 or lower to use 'assert' as an identifier)
    2 errors


javac AssertAsKeyword.java -source 1.3 AssertAsKeyword.java
    warning: [options] bootstrap class path not set in conjunction with -source 1.3
    warning: [options] source value 1.3 is obsolete and will be removed in a future release
    warning: [options] target value 1.4 is obsolete and will be removed in a future release
    warning: [options] To suppress warnings about obsolete options, use -Xlint:-options.
    AssertAsKeyword.java:12: warning: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
            int assert =10;
                ^
      (use -source 1.4 or higher to use 'assert' as a keyword)
    AssertAsKeyword.java:15: warning: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
            System.out.println(assert);
                               ^
      (use -source 1.4 or higher to use 'assert' as a keyword)
    6 warnings

java AssertAsKeyword
    10
 */

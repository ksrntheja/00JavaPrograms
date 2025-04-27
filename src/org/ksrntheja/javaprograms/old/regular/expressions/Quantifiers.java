/*
 * (13) Regular Expressions
 * (13 - 4) Quantifiers
 */

package org.ksrntheja.javaprograms.old.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class Quantifiers {

    public static void main(String[] args) {

        String pattern = "a";
        characterPattern(pattern);
        pattern = "a+";
        characterPattern(pattern);
        pattern = "a*";
        characterPattern(pattern);
        pattern = "a?";
        characterPattern(pattern);

    }

    private static void characterPattern(String patternString) {
        separator(patternString);
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher("abaabaaab");
        while (matcher.find()) {
            System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        }
    }

}
/*
====================================================================================
a
====================================================================================
0...1...a
2...3...a
3...4...a
5...6...a
6...7...a
7...8...a
====================================================================================
a+
====================================================================================
0...1...a
2...4...aa
5...8...aaa
====================================================================================
a*
====================================================================================
0...1...a
1...1...
2...4...aa
4...4...
5...8...aaa
8...8...
9...9...
====================================================================================
a?
====================================================================================
0...1...a
1...1...
2...3...a
3...4...a
4...4...
5...6...a
6...7...a
7...8...a
8...8...
9...9...
 */

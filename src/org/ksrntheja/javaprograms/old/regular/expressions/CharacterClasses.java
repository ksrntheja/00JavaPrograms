/*
 * (13) Regular Expressions
 * (13 - 2) Character Classes
 */

package org.ksrntheja.javaprograms.old.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class CharacterClasses {

    public static void main(String[] args) {

        String pattern = "[abc]";
        characterPattern(pattern);
        pattern = "[^abc]";
        characterPattern(pattern);
        pattern = "[a-z]";
        characterPattern(pattern);
        pattern = "[0-9]";
        characterPattern(pattern);
        pattern = "[a-zA-Z0-9]";
        characterPattern(pattern);
        pattern = "[^a-zA-Z0-9]";
        characterPattern(pattern);
        pattern = "[A-Z]";
        characterPattern(pattern);
        pattern = "[a-zA-Z]";
        characterPattern(pattern);

    }

    private static void characterPattern(String patternString) {
        separator(patternString);
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher("a7b@z9#k");
        while (matcher.find()) {
            System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        }
    }

}
/*
====================================================================================
[abc]
====================================================================================
0...1...a
2...3...b
====================================================================================
[^abc]
====================================================================================
1...2...7
3...4...@
4...5...z
5...6...9
6...7...#
7...8...k
====================================================================================
[a-z]
====================================================================================
0...1...a
2...3...b
4...5...z
7...8...k
====================================================================================
[0-9]
====================================================================================
1...2...7
5...6...9
====================================================================================
[a-zA-Z0-9]
====================================================================================
0...1...a
1...2...7
2...3...b
4...5...z
5...6...9
7...8...k
====================================================================================
[^a-zA-Z0-9]
====================================================================================
3...4...@
6...7...#
====================================================================================
[A-Z]
====================================================================================
====================================================================================
[a-zA-Z]
====================================================================================
0...1...a
2...3...b
4...5...z
7...8...k
 */

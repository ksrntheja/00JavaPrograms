/*
 * (13) Regular Expressions
 * (13 - 3) PreDefined Character Classes
 */

package org.ksrntheja.javaprograms.old.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class PreDefinedCharacterClasses {

    public static void main(String[] args) {

        String pattern = "\\s";
        characterPattern(pattern);
        pattern = "\\S";
        characterPattern(pattern);
        pattern = "\\d";
        characterPattern(pattern);
        pattern = "\\D";
        characterPattern(pattern);
        pattern = "\\w";
        characterPattern(pattern);
        pattern = "\\W";
        characterPattern(pattern);
        pattern = ".";
        characterPattern(pattern);

    }

    private static void characterPattern(String patternString) {
        separator(patternString);
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher("a7b k@9z");
        while (matcher.find()) {
            System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        }
    }

}
/*
====================================================================================
\s
====================================================================================
3...4...
====================================================================================
\S
====================================================================================
0...1...a
1...2...7
2...3...b
4...5...k
5...6...@
6...7...9
7...8...z
====================================================================================
\d
====================================================================================
1...2...7
6...7...9
====================================================================================
\D
====================================================================================
0...1...a
2...3...b
3...4...
4...5...k
5...6...@
7...8...z
====================================================================================
\w
====================================================================================
0...1...a
1...2...7
2...3...b
4...5...k
6...7...9
7...8...z
====================================================================================
\W
====================================================================================
3...4...
5...6...@
====================================================================================
.
====================================================================================
0...1...a
1...2...7
2...3...b
3...4...
4...5...k
5...6...@
6...7...9
7...8...z
 */

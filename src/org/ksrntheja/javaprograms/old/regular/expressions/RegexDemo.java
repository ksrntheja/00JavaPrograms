/*
 * (13) Regular Expressions
 * (13 - 1) Introduction
 */

package org.ksrntheja.javaprograms.old.regular.expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

        int count = 0;
        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("abbababa");
        while (matcher.find()) {
            count++;
            System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        }
        System.out.println("The number of occurrences: " + count);

        pattern = Pattern.compile("ab");
        matcher = pattern.matcher("abbababa");
        // RE: Exception in thread "main" java.lang.IllegalStateException: No match found
//        System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        System.out.println(matcher.find());
        System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        System.out.println(matcher.find());
        System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        System.out.println(matcher.find());
        System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        System.out.println(matcher.find());
        // RE: Exception in thread "main" java.lang.IllegalStateException: No match found
//        System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());

    }

}
/*
0...2...ab
3...5...ab
5...7...ab
The number of occurrences: 3
true
0...2...ab
0...2...ab
true
3...5...ab
true
5...7...ab
false
 */

/*
 * (13) Regular Expressions
 * [aA][a-zA-Z]*[nN]
 */

package org.ksrntheja.javaprograms.old.regular.expressions.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class ExampleB {

    public static void main(String[] args) {


        String pattern = "[aA][a-zA-Z]*[nN]";
        validate(pattern, "aN");
        validate(pattern, "an");
        validate(pattern, "a5N");

    }

    private static void validate(String patternString, String string) {
        separator(patternString + "  " + string);
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(string);
        if (matcher.find() && matcher.group().equals(string)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }

}

/*
====================================================================================
[aA][a-zA-Z]*[nN]  aN
====================================================================================
Valid
====================================================================================
[aA][a-zA-Z]*[nN]  an
====================================================================================
Valid
====================================================================================
[aA][a-zA-Z]*[nN]  a5N
====================================================================================
Not Valid
 */

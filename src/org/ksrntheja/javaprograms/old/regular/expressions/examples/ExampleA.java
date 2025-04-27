/*
 * (13) Regular Expressions
 * [a-k][0369][a-zA-Z0-9_#-]*
 */

package org.ksrntheja.javaprograms.old.regular.expressions.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class ExampleA {

    public static void main(String[] args) {


        String pattern = "[a-k][0369][a-zA-Z0-9_#-]*";
        validate(pattern, "h0aB8-#_");
        validate(pattern, "h0aB8-#_$");
        validate(pattern, "h5aB8-#_");

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
[a-k][0369][a-zA-Z0-9_#-]*  h0aB8-#_
====================================================================================
Valid
====================================================================================
[a-k][0369][a-zA-Z0-9_#-]*  h0aB8-#_$
====================================================================================
Not Valid
====================================================================================
[a-k][0369][a-zA-Z0-9_#-]*  h5aB8-#_
====================================================================================
Not Valid
 */

/*
 * (13) Regular Expressions
 * Validate Email Ids
 */

package org.ksrntheja.javaprograms.old.regular.expressions.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class ValidateEmailIds {

    public static void main(String[] args) {


        String validEmailPattern = "[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+";
        validateEmailIds(validEmailPattern, "test@gmail.com");
        validateEmailIds(validEmailPattern, "tEst_te5t@gmail.com");
        validateEmailIds(validEmailPattern, "tEst_te5t#@gmail.com");
        validateEmailIds(validEmailPattern, "@gmail.com");
        validateEmailIds(validEmailPattern, "8@gmail.com");
        validateEmailIds(validEmailPattern, "test@gmail.co.in");
        validateEmailIds(validEmailPattern, "test@gmail");

    }

    private static void validateEmailIds(String patternString, String emailId) {
        separator(patternString + "  " + emailId);
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(emailId);
        if (matcher.find() && matcher.group().equals(emailId)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }

}

/*
====================================================================================
[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+  test@gmail.com
====================================================================================
Valid
====================================================================================
[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+  tEst_te5t@gmail.com
====================================================================================
Valid
====================================================================================
[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+  tEst_te5t#@gmail.com
====================================================================================
Not Valid
====================================================================================
[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+  @gmail.com
====================================================================================
Not Valid
====================================================================================
[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+  8@gmail.com
====================================================================================
Valid
====================================================================================
[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+  test@gmail.co.in
====================================================================================
Valid
====================================================================================
[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+  test@gmail
====================================================================================
Not Valid
 */

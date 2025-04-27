/*
 * (13) Regular Expressions
 * Print all .txt file names
 */

package org.ksrntheja.javaprograms.old.regular.expressions.examples;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleE {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/regular/expressions/examples/";

        Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._$]*[.]txt");

        File file = new File(filePath);
        String[] files = file.list();

        for (String fileName : files) {
            Matcher matcher = pattern.matcher(fileName);
            if (matcher.find() && matcher.group().equals(fileName)) {
                System.out.println(fileName);
            }
        }

    }

}

/*
input.txt
output.txt
 */

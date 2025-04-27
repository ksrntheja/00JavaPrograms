/*
 * (13) Regular Expressions
 * Read mobile numbers from file
 */

package org.ksrntheja.javaprograms.old.regular.expressions.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleC {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/regular/expressions/examples/";

        Pattern pattern = Pattern.compile("(0 | [+]?91)?[7-9][0-9]{9}");

        PrintWriter printWriter = new PrintWriter(filePath + "output.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath + "input.txt"));

        String line = bufferedReader.readLine();
        while (line != null) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                printWriter.println(matcher.group());
            }
            line = bufferedReader.readLine();
        }

        printWriter.flush();
        printWriter.close();
        bufferedReader.close();

    }

}

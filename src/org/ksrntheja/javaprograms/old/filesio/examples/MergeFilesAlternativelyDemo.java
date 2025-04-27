/*
 * (11) IO package
 * Merge files Alternatively
 */

package org.ksrntheja.javaprograms.old.filesio.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFilesAlternativelyDemo {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/examples/";

        PrintWriter printWriter01 = new PrintWriter(filePath + "FileC.txt");

        BufferedReader bufferedReader01 = new BufferedReader(new FileReader(filePath + "FileA.txt"));

        BufferedReader bufferedReader02 = new BufferedReader(new FileReader(filePath + "FileB.txt"));


        String line01 = bufferedReader01.readLine();
        String line02 = bufferedReader02.readLine();

        while ((line01 != null) || (line02 != null)) {
            if ((line01 != null)) {
                printWriter01.println(line01);
                line01 = bufferedReader01.readLine();
            }
            if ((line02 != null)) {
                printWriter01.println(line02);
                line02 = bufferedReader02.readLine();
            }
        }

        bufferedReader01.close();

        bufferedReader02.close();

        printWriter01.flush();
        printWriter01.close();

    }

}

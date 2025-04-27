/*
 * (11) IO package
 * Merge files
 */

package org.ksrntheja.javaprograms.old.filesio.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFilesDemo {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/examples/";

        PrintWriter printWriter01 = new PrintWriter(filePath + "FileC.txt");

        BufferedReader bufferedReader01 = new BufferedReader(new FileReader(filePath + "FileA.txt"));
        String line = bufferedReader01.readLine();
        while (line != null) {
            printWriter01.println(line);
            line = bufferedReader01.readLine();
        }

        bufferedReader01.close();

        bufferedReader01 = new BufferedReader(new FileReader(filePath + "FileB.txt"));
        line = bufferedReader01.readLine();
        while (line != null) {
            printWriter01.println(line);
            line = bufferedReader01.readLine();
        }

        bufferedReader01.close();

        printWriter01.flush();
        printWriter01.close();

    }

}

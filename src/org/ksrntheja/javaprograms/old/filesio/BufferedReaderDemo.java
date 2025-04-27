/*
 * (11) IO package
 * (11 - 5) BufferedReader class
 */

package org.ksrntheja.javaprograms.old.filesio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/file/";

        BufferedReader bufferedReader01 = new BufferedReader(new FileReader(filePath + "BufferedWriter.txt"));
        BufferedReader bufferedReader012 = new BufferedReader(new FileReader(filePath + "BufferedWriter.txt"), 10);

        String line = bufferedReader01.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader01.readLine();
        }
        bufferedReader01.close();

    }
}

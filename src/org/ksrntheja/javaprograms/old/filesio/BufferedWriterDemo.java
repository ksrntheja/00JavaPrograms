/*
 * (11) IO package
 * (11 - 4) BufferedWriter class
 */

package org.ksrntheja.javaprograms.old.filesio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/file/";

        BufferedWriter bufferedWriter01 = new BufferedWriter(new FileWriter(filePath + "BufferedWriter.txt"));
        BufferedWriter bufferedWriter02 = new BufferedWriter(new FileWriter(filePath + "BufferedWriter.txt"), 10);

        bufferedWriter01.write(74);
        bufferedWriter01.write("ava");
        bufferedWriter01.newLine();
        char[] chars = {'M', 'y', 'S', 'Q', 'L'};
        bufferedWriter01.write(chars);
        bufferedWriter01.flush();
        bufferedWriter01.close();

    }

}

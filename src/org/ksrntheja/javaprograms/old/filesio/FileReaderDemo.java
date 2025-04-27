/*
 * (11) IO package
 * (11 - 3) FileReader class
 */

package org.ksrntheja.javaprograms.old.filesio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Deprecated
public class FileReaderDemo {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/file/";

        File file01 = new File(filePath + "FileReader01.txt");
        FileReader fileReader01 = new FileReader(file01);

        FileReader fileReader02 = new FileReader(filePath + "FileReader02.txt");

        char[] chars = new char[(int) file01.length()];
//        char[] chars = new char[10];
        System.out.println(fileReader01.read(chars));
        for (char c : chars) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        int i = fileReader02.read();
        while (i != -1) {
            System.out.println((char) i);
            i = fileReader02.read();
        }

        fileReader01.close();
        fileReader02.close();

    }

}

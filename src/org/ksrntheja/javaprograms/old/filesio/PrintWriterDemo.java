/*
 * (11) IO package
 * (11 - 6) PrintWriter class
 */

package org.ksrntheja.javaprograms.old.filesio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/file/";


        PrintWriter printWriter01 = new PrintWriter(filePath + "PrintWriter01.txt");

        File file01 = new File(filePath + "PrintWriter02.txt");
        PrintWriter printWriter02 = new PrintWriter(file01);

        FileWriter fileWriter01 = new FileWriter(filePath + "PrintWriter03.txt");
        PrintWriter printWriter03 = new PrintWriter(fileWriter01);

        printWriter01.write(74);
        printWriter01.println(74);
        printWriter01.println(true);
        printWriter01.println('a');
        printWriter01.println("java");

        printWriter01.flush();
        printWriter01.close();

    }

}

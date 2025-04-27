/*
 * (11) IO package
 * Duplicates eliminator
 */

package org.ksrntheja.javaprograms.old.filesio.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplicatesEliminatorDemo {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/examples/";

        PrintWriter printWriter01 = new PrintWriter(filePath + "FileH.txt");

        BufferedReader bufferedReader01 = new BufferedReader(new FileReader(filePath + "FileG.txt"));

//        BufferedReader bufferedReader02 = new BufferedReader(new FileReader(filePath + "FileE.txt"));
        BufferedReader bufferedReader02 = null;

        String line = bufferedReader01.readLine();

        while (line != null) {
            boolean available = false;
            bufferedReader02 = new BufferedReader(new FileReader(filePath + "FileH.txt"));
            String target = bufferedReader02.readLine();
            while (target != null) {
                if (line.equals(target)) {
                    available = true;
                    break;
                }
                target = bufferedReader02.readLine();
            }
            if (available == false) {
                printWriter01.println(line);
//                printWriter01.flush();
                printWriter01.flush();
            }
            line = bufferedReader01.readLine();
        }

        bufferedReader01.close();

        bufferedReader02.close();

        printWriter01.close();

    }

}

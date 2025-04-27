/*
 * (11) IO package
 * (11 - 2) FileWriter class
 */

package org.ksrntheja.javaprograms.old.filesio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Deprecated
public class FileWriterDemo {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/file/";

        FileWriter fileWriter01 = new FileWriter(filePath + "FileWriter01.txt");

        File file01 = new File(filePath + "FileWriter02.txt");
        FileWriter fileWriter02 = new FileWriter(file01);

        FileWriter fileWriter03 = new FileWriter(filePath + "FileWriter01.txt", true);

        FileWriter fileWriter04 = new FileWriter(file01, true);

        FileWriter fileWriter05 = new FileWriter(filePath + "FileWriter03.txt", true);
        File file02 = new File(filePath + "FileWriter04.txt");
        FileWriter fileWriter06 = new FileWriter(file02, true);

        fileWriter01.write("FileWriter01.txt");
        fileWriter02.write("FileWriter02.txt");
        fileWriter03.write("append");
        fileWriter04.write("append");
        fileWriter05.write("FileWriter03.txt");
        fileWriter06.write("FileWriter04.txt");
        fileWriter01.flush();
        fileWriter01.close();
        fileWriter02.flush();
        fileWriter02.close();
        fileWriter03.flush();
        fileWriter03.close();
        fileWriter04.flush();
        fileWriter04.close();
        fileWriter05.flush();
        fileWriter05.close();
        fileWriter06.flush();
        fileWriter06.close();
        FileWriter fileWriter07 = new FileWriter(filePath + "FileWriter05.txt");
        fileWriter07.write(74);
        fileWriter07.write("ava\nOracle");
        fileWriter07.write("\n");
        char[] chars = {'M', 'y', 'S', 'Q', 'L'};
        fileWriter07.write(chars);
        fileWriter07.flush();
        fileWriter07.close();

    }

}

/*
 * (11) IO Package
 * (11 - 1) File class
 */

package org.ksrntheja.javaprograms.old.filesio.file;

import java.io.File;
import java.io.IOException;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        String filePath = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/file/";

        separator("File class constructor - file");
        File myFile01 = new File(filePath + "myFile01.txt");
        System.out.println(myFile01.exists());
        // false
        myFile01.createNewFile();
        System.out.println(myFile01.exists());
        // true

        separator("File class constructor - directory");
        File myDirectory01 = new File(filePath + "myDirectory01");
        System.out.println(myDirectory01.exists());
        // false
        myDirectory01.mkdir();
        System.out.println(myDirectory01.exists());
        // true
        File myDirectory02 = new File(myDirectory01, "myDirectory02");
        System.out.println(myDirectory02.exists());
        // false
        myDirectory02.mkdir();
        System.out.println(myDirectory02.exists());
        // true

        separator("File class constructor - file C Drive");
        File myFile02 = new File("C:\\Users\\myFile02.txt");
        System.out.println(myFile02.exists());
        // false
//        myFile02.createNewFile();
//        Exception in thread "main" java.io.IOException: Access is denied
//        at java.base/java.io.WinNTFileSystem.createFileExclusively0(Native Method)
//        at java.base/java.io.WinNTFileSystem.createFileExclusively(WinNTFileSystem.java:536)
//        at java.base/java.io.File.createNewFile(File.java:1045)

        separator("File class constructor - file inside a directory");
        File myFile03 = new File(filePath + "myDirectory01", "myFile03.txt");
        myFile03.createNewFile();
        File myFile04 = new File(myDirectory01, "myFile04.txt");
        System.out.println(myFile04.createNewFile());
        // true
        System.out.println(myFile04.createNewFile());
        // false
        System.out.println(myFile03.exists());
        // true
        System.out.println(myFile04.exists());
        // true

        separator("List all files & directories inside a directory");
        int countFilesDirectories = 0;
        String[] listFilesDirectories = myDirectory01.list();
        System.out.println("Files & directories:");
        for (String name : listFilesDirectories) {
            countFilesDirectories++;
            System.out.println(name);
        }
        System.out.println("Total files & directories: " + countFilesDirectories);

        int countFiles = 0;
        String[] listFiles = myDirectory01.list();
        System.out.println("Files:");
        for (String name : listFiles) {
            File file = new File(myDirectory01, name);
            if (file.isFile()) {
                countFiles++;
                System.out.println(name);
            }
        }
        System.out.println("Total files: " + countFiles);

        int countDirectories = 0;
        String[] listDirectories = myDirectory01.list();
        System.out.println("Directories:");
        for (String name : listDirectories) {
            File file = new File(myDirectory01, name);
            if (file.isDirectory()) {
                countDirectories++;
                System.out.println(name);
            }
        }
        System.out.println("Total Directories: " + countDirectories);

    }

}

/*
E:\Learn\Java\IDEAProjectsE\00JavaPrograms
====================================================================================
File class constructor - file
====================================================================================
false
true
====================================================================================
File class constructor - directory
====================================================================================
false
true
false
true
====================================================================================
File class constructor - file C Drive
====================================================================================
false
====================================================================================
File class constructor - file inside a directory
====================================================================================
true
false
true
true
====================================================================================
List all files & directories inside a directory
====================================================================================
Files & directories:
myDirectory02
myFile03.txt
myFile04.txt
Total files & directories: 3
Files:
myFile03.txt
myFile04.txt
Total files: 2
Directories:
myDirectory02
Total Directories: 1
 */

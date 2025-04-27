/*
 * (11) NIO package
 */

package org.ksrntheja.javaprograms.old.filesio.niodemo;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class NIODemo {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
        String filePathAppend = System.getProperty("user.dir") + "/src/org/ksrntheja/javaprograms/old/filesio/niodemo/";

        boolean exists = Files.exists(Paths.get(filePathAppend + "example.txt"));
        System.out.println(exists);

        Path filePath = Paths.get(filePathAppend + "example.txt");

        try {
            Files.createFile(filePath);
            System.out.println("File created: " + filePath.toAbsolutePath());
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> content = Arrays.asList("Hello", "World");
        try {
            Files.write(Paths.get(filePathAppend + "example.txt"), content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePathAppend + "example.txt"));
            System.out.println(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

/*
E:\Learn\Java\IDEAProjectsE\00JavaPrograms
false
File created: E:\Learn\Java\IDEAProjectsE\00JavaPrograms\src\org\ksrntheja\javaprograms\old\filesio\niodemo\example.txt
[Hello, World]
 */

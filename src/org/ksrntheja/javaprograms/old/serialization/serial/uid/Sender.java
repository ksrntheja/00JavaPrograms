package org.ksrntheja.javaprograms.old.serialization.serial.uid;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new SerializeDemoQ());

        objectOutputStream.close();
        fileOutputStream.close();


    }

}

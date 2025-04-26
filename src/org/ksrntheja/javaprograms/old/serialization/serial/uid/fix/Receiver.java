package org.ksrntheja.javaprograms.old.serialization.serial.uid.fix;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SerializeDemoQ serializeDemoQ = (SerializeDemoQ) objectInputStream.readObject();
        System.out.println(serializeDemoQ.i + "..." + serializeDemoQ.j);

        objectInputStream.close();
        fileInputStream.close();

    }

}

/*
10...20
 */

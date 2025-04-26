/*
 * (12) Serialization
 * (12 - 1-2) Multiple object
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationMultipleObjectsDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new SerializeDemoG());
        objectOutputStream.writeObject(new SerializeDemoH());
        objectOutputStream.writeObject(new SerializeDemoI());

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SerializeDemoG serializeDemoG = (SerializeDemoG) objectInputStream.readObject();
        System.out.println(serializeDemoG.i + "..." + serializeDemoG.j);

        SerializeDemoH serializeDemoH = (SerializeDemoH) objectInputStream.readObject();
        System.out.println(serializeDemoH.i + "..." + serializeDemoH.j);

        SerializeDemoI serializeDemoI = (SerializeDemoI) objectInputStream.readObject();
        System.out.println(serializeDemoI.i + "..." + serializeDemoI.j);

        objectInputStream.close();
        fileInputStream.close();

    }

}

class SerializeDemoG implements Serializable {

    int i = 10;
    int j = 20;

}


class SerializeDemoH implements Serializable {

    String i = "Java";
    String j = "Oracle";

}

class SerializeDemoI implements Serializable {

    String i = "MySQL";
    int j = 8;

}

/*
10...20
Java...Oracle
MySQL...8
 */

/*
 * (12) Serialization
 * (12 - 4-2) Inheritance in Serialization
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InheritanceSerializationB {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializeDemoP serializeDemoP = new SerializeDemoP();
        serializeDemoP.i = 888;
        serializeDemoP.j = 999;

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(serializeDemoP);

        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("deserialize");

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SerializeDemoP deserializeDemoP = (SerializeDemoP) objectInputStream.readObject();
        System.out.println(deserializeDemoP.i + "..." + deserializeDemoP.j);

        objectInputStream.close();
        fileInputStream.close();

    }

}

class SerializeDemoO {

    int i = 10;

    public SerializeDemoO() {
        System.out.println("SerializeDemoO constructor");
    }

}

class SerializeDemoP extends SerializeDemoO implements Serializable {

    int j = 20;

    public SerializeDemoP() {
        System.out.println("SerializeDemoP constructor");
    }

}

/*
SerializeDemoO constructor
SerializeDemoP constructor
deserialize
SerializeDemoO constructor
10...999
 */

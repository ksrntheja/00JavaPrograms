/*
 * (12) Serialization
 * (12 - 4-1) Inheritance in Serialization
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InheritanceSerializationA {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new SerializeDemoN());

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SerializeDemoN serializeDemoN = (SerializeDemoN) objectInputStream.readObject();
        System.out.println(serializeDemoN.i + "..." + serializeDemoN.j);

        objectInputStream.close();
        fileInputStream.close();

    }

}

class SerializeDemoM implements Serializable {

    int i = 10;

}

class SerializeDemoN extends SerializeDemoM {

    int j = 20;

}

/*
10...20
 */

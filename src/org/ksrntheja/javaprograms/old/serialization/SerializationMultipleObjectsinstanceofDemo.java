/*
 * (12) Serialization
 * (12 - 1-3) Multiple object using instanceof
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.*;

public class SerializationMultipleObjectsinstanceofDemo {

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

        Object object = objectInputStream.readObject();

        if (object instanceof SerializeDemoH) {
            SerializeDemoH serializeDemoH = (SerializeDemoH) object;
            System.out.println(serializeDemoH.i + "..." + serializeDemoH.j);
        } else if (object instanceof SerializeDemoG) {
            SerializeDemoG serializeDemoG = (SerializeDemoG) object;
            System.out.println(serializeDemoG.i + "..." + serializeDemoG.j);
        }

        objectInputStream.close();
        fileInputStream.close();

    }

}

/*
10...20
 */

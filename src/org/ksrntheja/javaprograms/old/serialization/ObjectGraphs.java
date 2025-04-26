/*
 * (12) Serialization
 * (12 - 2) Object Graphs
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.*;

public class ObjectGraphs {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new SerializeDemoJ());

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SerializeDemoJ serializeDemoJ = (SerializeDemoJ) objectInputStream.readObject();
        System.out.println(serializeDemoJ.serializeDemoK.serializeDemoL.j);

        objectInputStream.close();
        fileInputStream.close();


    }

}


class SerializeDemoJ implements Serializable {

    SerializeDemoK serializeDemoK = new SerializeDemoK();

}


class SerializeDemoK implements Serializable {

    SerializeDemoL serializeDemoL = new SerializeDemoL();

}

class SerializeDemoL implements Serializable {

    int j = 20;

}

/*
20
 */

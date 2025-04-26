/*
 * (12) Serialization
 * (12 - 1-1) Single object
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        serialize(new SerializeDemoA());
        SerializeDemoA deserializeDemoA = (SerializeDemoA) deserialize();
        System.out.println(deserializeDemoA.i + "..." + deserializeDemoA.j);

        /*
        SerializeDemoB serializeDemob = new SerializeDemoB();
        serialize(serializeDemob);

        Exception in thread "main" java.io.NotSerializableException: org.ksrntheja.javaprograms.old.serialization.SerializeDemoB
            at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1201)
            at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:359)
            at org.ksrntheja.javaprograms.old.serialization.SerializationDemo.serialize(SerializationDemo.java:38)
            at org.ksrntheja.javaprograms.old.serialization.SerializationDemo.main(SerializationDemo.java:21)
         */

//        SerializeDemoB deserializeDemob = (SerializeDemoB) deserialize();
//        System.out.println(deserializeDemob.i + "..." + deserializeDemob.j);

        serialize(new SerializeDemoC());
        SerializeDemoC deserializeDemoC = (SerializeDemoC) deserialize();
        System.out.println(deserializeDemoC.i + "..." + deserializeDemoC.j);

        serialize(new SerializeDemoD());
        SerializeDemoD deserializeDemoD = (SerializeDemoD) deserialize();
        System.out.println(deserializeDemoD.i + "..." + deserializeDemoD.j);

        serialize(new SerializeDemoE());
        SerializeDemoE deserializeDemoE = (SerializeDemoE) deserialize();
        System.out.println(deserializeDemoE.i + "..." + deserializeDemoE.j);


        serialize(new SerializeDemoF());
        SerializeDemoF deserializeDemoF = (SerializeDemoF) deserialize();
        System.out.println(deserializeDemoF.i + "..." + deserializeDemoF.j);

    }

    private static void serialize(Object object) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    private static Object deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return object;
    }

}

class SerializeDemoA implements Serializable {

    int i = 10;
    int j = 20;

}

class SerializeDemoB {

    int i = 10;
    int j = 20;

}

class SerializeDemoC implements Serializable {

    transient int i = 10;
    int j = 20;

}

class SerializeDemoD implements Serializable {

    transient static int i = 10;
    transient int j = 20;

}

class SerializeDemoE implements Serializable {

    transient int i = 10;
    transient final int j = 10;

}

class SerializeDemoF implements Serializable {

    transient static int i = 10;
    transient final int j = 20;

}


/*
10...20
0...20
10...0
0...10
10...20
 */

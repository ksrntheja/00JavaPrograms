package org.ksrntheja.javaprograms.old.serialization.serial.uid;

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
Exception in thread "main" java.io.InvalidClassException: org.ksrntheja.javaprograms.old.serialization.serial.uid.SerializeDemoQ; local class incompatible: stream classdesc serialVersionUID = -1529318972544512844, local class serialVersionUID = 2225923966576595760
	at java.base/java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:604)
	at java.base/java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:2072)
	at java.base/java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1915)
	at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2246)
	at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1750)
	at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:528)
	at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:486)
	at org.ksrntheja.javaprograms.old.serialization.serial.uid.Receiver.main(Receiver.java:14)
 */

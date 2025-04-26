/*
 * (12) Serialization
 * (12 - 5-2) Externalizable vs Serializable
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExternalizableDemoB implements Serializable {

    String s;
    int i;
    int j;

    public ExternalizableDemoB() {
        System.out.println("ExternalizableDemoB constructor");
    }

    public ExternalizableDemoB(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new ExternalizableDemoB("Java", 2, 3));

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ExternalizableDemoB externalizableDemo = (ExternalizableDemoB) objectInputStream.readObject();
        System.out.println(externalizableDemo.s + "..." + externalizableDemo.i + "..." + externalizableDemo.j);

        objectInputStream.close();
        fileInputStream.close();

    }

}

/*
Java...2...3
 */

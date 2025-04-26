/*
 * (12) Serialization
 * (12 - 5-3) Externalizable vs Serializable (all transient)
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExternalizableDemoC implements Serializable {

    transient String s;
    transient int i;
    transient int j;

    public ExternalizableDemoC() {
        System.out.println("ExternalizableDemoC constructor");
    }

    public ExternalizableDemoC(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new ExternalizableDemoC("Java", 2, 3));

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ExternalizableDemoC externalizableDemo = (ExternalizableDemoC) objectInputStream.readObject();
        System.out.println(externalizableDemo.s + "..." + externalizableDemo.i + "..." + externalizableDemo.j);

        objectInputStream.close();
        fileInputStream.close();

    }

}

/*
null...0...0
 */

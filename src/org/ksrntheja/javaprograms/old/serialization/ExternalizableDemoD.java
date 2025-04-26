/*
 * (12) Serialization
 * (12 - 5-4) Externalizable (all transient)
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableDemoD implements Externalizable {

    transient String s;
    transient int i;
    transient int j;

    public ExternalizableDemoD() {
        System.out.println("ExternalizableDemoD constructor");
    }

    public ExternalizableDemoD(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s = (String) in.readObject();
        i = in.readInt();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(new ExternalizableDemoD("Java", 2, 3));

        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("deserialize");

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ExternalizableDemoD externalizableDemo = (ExternalizableDemoD) objectInputStream.readObject();
        System.out.println(externalizableDemo.s + "..." + externalizableDemo.i + "..." + externalizableDemo.j);

        objectInputStream.close();
        fileInputStream.close();

    }

}

/*
deserialize
ExternalizableDemoD constructor
Java...2...0
 */

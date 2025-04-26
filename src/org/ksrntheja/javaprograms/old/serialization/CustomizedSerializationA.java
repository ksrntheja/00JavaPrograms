/*
 * (12) Serialization
 * (12 - 3-1) Customized Serialization
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerializationA {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Account account01 = new Account();
        System.out.println(account01.userName + "..." + account01.password);

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(account01);

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Account account02 = (Account) objectInputStream.readObject();
        System.out.println(account02.userName + "..." + account02.password);

        objectInputStream.close();
        fileInputStream.close();

    }

}

class Account implements Serializable {

    String userName = "java";
    transient String password = "j@va";

}

/*
java...j@va
java...null
 */

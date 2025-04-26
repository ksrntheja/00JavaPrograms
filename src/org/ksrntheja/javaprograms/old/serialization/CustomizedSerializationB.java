/*
 * (12) Serialization
 * (12 - 3-2) Customized Serialization
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerializationB {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        AccountCustom account01 = new AccountCustom();
        System.out.println(account01.userName + "..." + account01.password);

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(account01);

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        AccountCustom account02 = (AccountCustom) objectInputStream.readObject();
        System.out.println(account02.userName + "..." + account02.password);

        objectInputStream.close();
        fileInputStream.close();

    }

}

class AccountCustom implements Serializable {

    String userName = "java";
    transient String password = "j@va";

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        String encryptedPassword = "123" + password;
        objectOutputStream.writeObject(encryptedPassword);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String encryptedPassword = (String) objectInputStream.readObject();
        password = encryptedPassword.substring(3);
    }

}

/*
java...j@va
java...j@va
 */

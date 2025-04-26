/*
 * (12) Serialization
 * (12 - 3-3) Customized Serialization
 */

package org.ksrntheja.javaprograms.old.serialization;

import java.io.*;

public class CustomizedSerializationC {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        AccountCustomInt account01 = new AccountCustomInt();
        System.out.println(account01.userName + "..." + account01.password + "..." + account01.pin);

        FileOutputStream fileOutputStream = new FileOutputStream("Object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(account01);

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        AccountCustomInt account02 = (AccountCustomInt) objectInputStream.readObject();
        System.out.println(account02.userName + "..." + account02.password + "..." + account02.pin);

        objectInputStream.close();
        fileInputStream.close();

    }

}

class AccountCustomInt implements Serializable {

    String userName = "java";
    transient String password = "j@va";
    transient int pin = 1234;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        String encryptedPassword = "123" + password;
        objectOutputStream.writeObject(encryptedPassword);
        int encryptedPin = pin + 4444;
        objectOutputStream.writeInt(encryptedPin);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        String encryptedPassword = (String) objectInputStream.readObject();
        password = encryptedPassword.substring(3);
        int encryptedPin = objectInputStream.readInt();
        pin = encryptedPin - 4444;
    }

}

/*
java...j@va...1234
java...j@va...1234
 */

package org.ksrntheja.javaprograms.eigth.staticmethods;

class Parent {

    private void m1() {
        System.out.println("Parent::private void m1()");
    }

}

public class PrivateMethodInClass extends Parent {

    public void m1() {
        System.out.println("PrivateMethodInClass::public void m1()");
    }

    public static void main(String args[]) {

        // Parent privateMethodInClass = new PrivateMethodInClass();
        // privateMethodInClass.m1();
        // 'm1()' has private access in 'org.ksrntheja.javaprograms.eigth.staticmethods.Parent'

        PrivateMethodInClass privateMethodInClass = new PrivateMethodInClass();
        privateMethodInClass.m1();

    }

}

// PrivateMethodInClass::public void m1()
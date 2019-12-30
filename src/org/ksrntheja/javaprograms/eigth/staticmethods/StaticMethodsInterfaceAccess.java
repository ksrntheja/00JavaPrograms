package org.ksrntheja.javaprograms.eigth.staticmethods;

interface StaticMethodsInterface {

    static void m01() {
        System.out.println("StaticMethodsInterface::static void m01()");
    }

}


public class StaticMethodsInterfaceAccess implements StaticMethodsInterface {

    public void m02() {
        m01();
        // Static method may be invoked on containing interface class only
    }

    public static void main(String[] args) {

        m01();
        // Static method may be invoked on containing interface class only
        StaticMethodsInterfaceAccess staticMethodsInterfaceAccess = new StaticMethodsInterfaceAccess();
        staticMethodsInterfaceAccess.m01();
        // Static method may be invoked on containing interface class only
        StaticMethodsInterfaceAccess.m01();
        // Static method may be invoked on containing interface class only
        StaticMethodsInterface.m01();

    }
}

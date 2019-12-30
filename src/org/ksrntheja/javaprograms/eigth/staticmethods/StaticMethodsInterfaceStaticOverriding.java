package org.ksrntheja.javaprograms.eigth.staticmethods;

interface StaticMethodsInterfaceStaticOverridingParent {

    static void m01() {
        System.out.println("StaticMethodsInterfaceStaticOverridingParent::static void m01()");
    }

}


public class StaticMethodsInterfaceStaticOverriding implements StaticMethodsInterfaceStaticOverridingParent {

    // @Override
    // Method does not override method from its superclass
    public static void m01() {
        System.out.println("StaticMethodsInterfaceStaticOverriding::public static void m01()");
    }

    public static void main(String[] args) {

        StaticMethodsInterfaceStaticOverriding staticMethodsInterfaceStaticOverriding = new StaticMethodsInterfaceStaticOverriding();
        staticMethodsInterfaceStaticOverriding.m01();

    }
}

// StaticMethodsInterfaceStaticOverriding::public static void m01()
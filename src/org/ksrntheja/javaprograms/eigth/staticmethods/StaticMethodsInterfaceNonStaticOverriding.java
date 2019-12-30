package org.ksrntheja.javaprograms.eigth.staticmethods;

interface StaticMethodsInterfaceNonStaticOverridingParent {

    static void m01() {
        System.out.println("StaticMethodsInterfaceNonStaticOverridingParent::static void m01()");
    }

}


public class StaticMethodsInterfaceNonStaticOverriding implements StaticMethodsInterfaceNonStaticOverridingParent {

    // @Override
    // Method does not override method from its superclass
    public void m01() {
        System.out.println("StaticMethodsInterfaceNonStaticOverriding::public void m01()");
    }

    public static void main(String[] args) {

        StaticMethodsInterfaceNonStaticOverriding staticMethodsInterfaceNonStaticOverriding = new StaticMethodsInterfaceNonStaticOverriding();
        staticMethodsInterfaceNonStaticOverriding.m01();

    }
}

// StaticMethodsInterfaceNonStaticOverriding::public void m01()
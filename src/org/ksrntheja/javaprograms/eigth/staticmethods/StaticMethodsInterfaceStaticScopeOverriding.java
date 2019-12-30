package org.ksrntheja.javaprograms.eigth.staticmethods;

interface StaticMethodsInterfaceStaticScopeOverridingParent {

    static void m01() {
        System.out.println("StaticMethodsInterfaceStaticScopeOverridingParent::static void m01()");
    }

}


public class StaticMethodsInterfaceStaticScopeOverriding implements StaticMethodsInterfaceStaticScopeOverridingParent {

    // @Override
    // Method does not override method from its superclass
    private static void m01() {
        System.out.println("StaticMethodsInterfaceStaticScopeOverriding::private static void m01()");
    }

    public static void main(String[] args) {

        StaticMethodsInterfaceStaticScopeOverriding staticMethodsInterfaceStaticScopeOverriding = new StaticMethodsInterfaceStaticScopeOverriding();
        staticMethodsInterfaceStaticScopeOverriding.m01();

    }
}

// StaticMethodsInterfaceStaticScopeOverriding::private static void m01()
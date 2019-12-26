package org.ksrntheja.javaprograms.eigth.functionalinterfaces;

@FunctionalInterface
public interface ExampleFunctionalInterface01 {

    void m1();

    default void m2() {
        System.out.println("hello default method");
    }

    static void m3() {
        System.out.println("hello static method");
    }

}

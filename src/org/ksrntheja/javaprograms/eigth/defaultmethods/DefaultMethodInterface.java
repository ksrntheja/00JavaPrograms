package org.ksrntheja.javaprograms.eigth.defaultmethods;

interface DefaultMethod {

    default void m1() {
        System.out.println("In DefaultMethod Interface :: default void m1()");
    }

}


public class DefaultMethodInterface implements DefaultMethod {

    public static void main(String args[]) {

        DefaultMethodInterface defaultMethodInterface = new DefaultMethodInterface();
        defaultMethodInterface.m1();

    }

}

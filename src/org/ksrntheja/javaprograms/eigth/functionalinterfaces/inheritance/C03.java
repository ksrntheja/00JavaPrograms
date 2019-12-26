package org.ksrntheja.javaprograms.eigth.functionalinterfaces.inheritance;

@FunctionalInterface
interface P03 {

    void m01();

}

@FunctionalInterface
// Multiple non-overriding abstract methods found in interface
public interface C03 extends P03 {

    void m02();

}

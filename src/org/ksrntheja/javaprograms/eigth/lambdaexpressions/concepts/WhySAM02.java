package org.ksrntheja.javaprograms.eigth.lambdaexpressions.concepts;

// Multiple non-overriding abstract methods found in interface
@FunctionalInterface
interface I02 {

    void mul(int x);

    void mult(int x);

}


public class WhySAM02 {

    public static void main(String args[]) {

        I02 i02 = x -> System.out.println(x * x);

        i02.mul(8);
        i02.mul(80);
    }

}

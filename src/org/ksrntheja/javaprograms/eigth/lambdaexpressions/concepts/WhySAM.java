package org.ksrntheja.javaprograms.eigth.lambdaexpressions.concepts;

interface I01 {

    void mul(int x);

}


public class WhySAM {

    public static void main(String args[]) {

        I01 i01 = x -> System.out.println(x * x);

        i01.mul(8);
        i01.mul(80);
    }

}

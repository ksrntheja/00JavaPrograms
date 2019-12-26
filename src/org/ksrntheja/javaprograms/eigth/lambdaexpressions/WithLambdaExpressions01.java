package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

interface I02 {

    void m01();

}

public class WithLambdaExpressions01 {

    public static void main(String args[]) {

        I02 i02 = () -> System.out.println("In class WithLambdaExpressions01, m01() method LAMBDA implementation");

        i02.m01();
    }
}
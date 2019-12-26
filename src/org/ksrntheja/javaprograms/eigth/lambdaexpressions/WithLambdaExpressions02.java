package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

interface I04 {

    void add(int a, int b);

}

public class WithLambdaExpressions02 {

    public static void main(String args[]) {

        I04 i04 = (a, b) -> System.out.println("In class WithLambdaExpressions02, add(int a, int b) method LAMBDA implementation, The Sum : " + (a + b));

        i04.add(10, 20);
        i04.add(100, 200);

    }

}

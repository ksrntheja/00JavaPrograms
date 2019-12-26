package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

interface I08 {

    int squareIt(int x);

}


public class WithLambdaExpressions04 {

    public static void main(String args[]) {

        I08 i08 = x -> x * x;
        System.out.println("Square of '8'  : " + i08.squareIt(8));
        System.out.println("Square of '80' : " + i08.squareIt(80));
    }

}

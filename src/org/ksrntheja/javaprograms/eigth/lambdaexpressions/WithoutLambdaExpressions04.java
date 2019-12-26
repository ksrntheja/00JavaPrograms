package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

interface I07 {

    int squareIt(int x);

}

class C04 implements I07 {

    @Override
    public int squareIt(int x) {
        System.out.println("In class C04, public int squareIt(int x) method NORMAL implementation");
        return x * x;
    }

}

public class WithoutLambdaExpressions04 {

    public static void main(String args[]) {

        I07 i07 = new C04();
        System.out.println("Square of '8'  : " + i07.squareIt(8));
        System.out.println("Square of '80' : " + i07.squareIt(80));
    }

}

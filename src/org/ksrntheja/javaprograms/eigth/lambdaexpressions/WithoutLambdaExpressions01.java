package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

interface I01 {

    void m01();

}

class C01 implements I01 {

    @Override
    public void m01() {
        System.out.println("In class C01, m01() method NORMAL implementation");
    }

}

public class WithoutLambdaExpressions01 {

    public static void main(String args[]) {
        I01 i01 = new C01();
        i01.m01();
    }

}

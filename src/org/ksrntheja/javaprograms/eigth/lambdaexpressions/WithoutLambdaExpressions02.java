package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

interface I03 {

    void add(int a, int b);

}

class C02 implements I03 {

    @Override
    public void add(int a, int b) {
        System.out.println("In class C02, add(int a, int b) method NORMAL implementation, The Sum : " + (a + b));
    }

}

public class WithoutLambdaExpressions02 {

    public static void main(String args[]) {

        I03 i03 = new C02();
        i03.add(10, 20);
        i03.add(100, 200);
    }

}

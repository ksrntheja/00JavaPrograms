package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

interface I05 {

    int getLength(String s);

}

class C03 implements I05 {

    @Override
    public int getLength(String s) {
        System.out.println("In class C03, public int getLength(String s) method NORMAL implementation");
        return s.length();
    }

}

public class WithoutLambdaExpressions03 {

    public static void main(String args[]) {

        I05 i05 = new C03();
        System.out.println("Length of 'THEJA' is " + i05.getLength("THEJA"));
        System.out.println("Length of 'KSRN'  is " + i05.getLength("KSRN"));
    }

}

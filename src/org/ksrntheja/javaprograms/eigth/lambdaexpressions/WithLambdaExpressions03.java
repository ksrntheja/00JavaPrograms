package org.ksrntheja.javaprograms.eigth.lambdaexpressions;

interface I06 {

    int getLength(String s);

}

public class WithLambdaExpressions03 {

    public static void main(String args[]) {

        I06 i06 = (s) -> {
            System.out.println("In class WithLambdaExpressions03, public int getLength(String s) method LAMBDA implementation");
            return s.length();
        };
        System.out.println("Length of 'THEJA' is " + i06.getLength("THEJA"));
        System.out.println("Length of 'KSRN'  is " + i06.getLength("KSRN"));


        I06 i0602 = (s) -> s.length();
        System.out.println("Length of 'THEJA KSRN' is " + i0602.getLength("THEJA KSRN"));
        System.out.println("Length of 'KSRNTHEJA'  is " + i0602.getLength("KSRNTHEJA"));
    }

}

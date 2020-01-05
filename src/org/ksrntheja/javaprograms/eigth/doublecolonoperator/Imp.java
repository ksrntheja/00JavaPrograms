package org.ksrntheja.javaprograms.eigth.doublecolonoperator;

import java.util.function.IntBinaryOperator;

public class Imp {

    public static void main(String[] a) {

        int sum = Integer.sum(6, 2);
        System.out.println("6 + 2 : " + sum);


        // sum = Integer::sum(6, 2);
        // int is not a functional interface
        // Error:(13, 27) java: ';' expected

        // IntBinaryOperator sumBinaryOperator = Integer::sum(6, 2);
        // Error:(2, 59) java: ';' expected

        IntBinaryOperator sumBinaryOperatorLambda = (int01, int02) -> int01 + int02;
        System.out.println("6 + 2 : " + sumBinaryOperatorLambda.applyAsInt(6, 2));


        IntBinaryOperator sumBinaryOperatorLambdaWithBody = (int01, int02) -> {
            return int01 + int02;
        };
        System.out.println("6 + 2 : " + sumBinaryOperatorLambdaWithBody.applyAsInt(6, 2));


        IntBinaryOperator sumBinaryOperatorLambdaWithBodyParameterType = (int int01, int int02) -> {
            return int01 + int02;
        };
        System.out.println("6 + 2 : " + sumBinaryOperatorLambdaWithBodyParameterType.applyAsInt(6, 2));


        IntBinaryOperator sumBinaryOperatorLambdaWithBodyParameterTypeLocalFinalVariable = (int int01, int int02) -> {
            final int i = int01 + int02;
            return i;
        };
        System.out.println("6 + 2 : " + sumBinaryOperatorLambdaWithBodyParameterTypeLocalFinalVariable.applyAsInt(6, 2));


        IntBinaryOperator sumBinaryOperatorLambdaWithBodyParameterTypeLocalVariable = (int int01, int int02) -> {
            int i = int01 + int02;
            return i;
        };
        System.out.println("6 + 2 : " + sumBinaryOperatorLambdaWithBodyParameterTypeLocalVariable.applyAsInt(6, 2));


        IntBinaryOperator sumBinaryOperatorAnonymousClassWithBodyParameterTypeLocalVariable = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int int01, int int02) {
                int i = int01 + int02;
                return i;
            }
        };
        System.out.println("6 + 2 : " + sumBinaryOperatorAnonymousClassWithBodyParameterTypeLocalVariable.applyAsInt(6, 2));


        IntBinaryOperator sumBinaryOperator = Integer::sum;
        System.out.println("6 + 2 : " + sumBinaryOperator.applyAsInt(6, 2));


    }


}

/*
6 + 2 : 8
6 + 2 : 8
6 + 2 : 8
6 + 2 : 8
6 + 2 : 8
6 + 2 : 8
6 + 2 : 8
6 + 2 : 8
 */
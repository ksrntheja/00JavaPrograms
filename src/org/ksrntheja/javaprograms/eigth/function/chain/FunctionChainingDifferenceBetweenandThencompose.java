package org.ksrntheja.javaprograms.eigth.function.chain;

import java.util.function.Function;

public class FunctionChainingDifferenceBetweenandThencompose {

    public static void main(String[] args) {

        Function<Integer, Integer> doubleFunction = integer -> integer + integer;
        Function<Integer, Integer> cubeFunction = integer -> integer * integer * integer;

        System.out.println("doubleFunction.andThen(cubeFunction).apply(2) : " + doubleFunction.andThen(cubeFunction).apply(2));
        System.out.println("doubleFunction.compose(cubeFunction).apply(2) : " + doubleFunction.compose(cubeFunction).apply(2));

    }

}

// doubleFunction.andThen(cubeFunction).apply(2) : 64
// doubleFunction.compose(cubeFunction).apply(2) :16

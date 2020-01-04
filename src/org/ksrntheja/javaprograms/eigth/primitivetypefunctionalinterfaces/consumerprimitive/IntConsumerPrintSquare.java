package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces.consumerprimitive;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class IntConsumerPrintSquare {

    public static void main(String[] args) {

        Consumer<Integer> squareConsumer = integer -> System.out.println(integer * integer);
        squareConsumer.accept(8);

        IntConsumer squareIntConsumer = int01 -> System.out.println(int01 * int01);
        squareIntConsumer.accept(80);

    }

}

// 64
// 6400
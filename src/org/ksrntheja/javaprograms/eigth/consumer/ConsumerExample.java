package org.ksrntheja.javaprograms.eigth.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String args[]) {

        Consumer<String> stringConsumer = string -> System.out.println(string);

        stringConsumer.accept("KSRNTHEJA");

    }

}

// KSRNTHEJA
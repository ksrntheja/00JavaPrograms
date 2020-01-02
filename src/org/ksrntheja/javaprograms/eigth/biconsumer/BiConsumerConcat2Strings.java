package org.ksrntheja.javaprograms.eigth.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerConcat2Strings {

    public static void main(String[] args) {

        BiConsumer<String, String> stringBiConsumer = (string01, string02) -> System.out.println(string01 + string02);

        stringBiConsumer.accept("KSRN", "THEJA");

    }

}

// KSRNTHEJA
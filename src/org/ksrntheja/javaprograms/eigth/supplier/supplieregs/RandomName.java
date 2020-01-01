package org.ksrntheja.javaprograms.eigth.supplier.supplieregs;

import java.util.function.Supplier;

public class RandomName {

    public static void main(String[] args) {

        Supplier<String> randomStringSupplier = () -> {
            String[] names = {"One", "Two", "Three", "Four"};
            // int index = (int) Math.random() * 4;
            // 'Math.random()' cast to 'int' is always rounded down to '0'
            int index = (int) (Math.random() * 4);
            return names[index];
        };

        System.out.println(randomStringSupplier.get());
        System.out.println(randomStringSupplier.get());
        System.out.println(randomStringSupplier.get());

    }

}

/*
Three
Four
Three
 */
package org.ksrntheja.javaprograms.eigth.supplier.supplieregs;

import java.util.function.Supplier;

public class RandomPassword {

    public static void main(String[] args) {

        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";

        // Supplier<String> characterGen = () -> symbols.charAt((int) (Math.random() * 29));
        // Bad return type in lambda expression: char cannot be converted to String

        Supplier<Character> characterSupplier = () -> symbols.charAt((int) (Math.random() * 29));

        Supplier<Integer> integerSupplier = () -> (int) (Math.random() * 10);

        Supplier<String> passwordSupplier = () -> {

            String password = "";
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {
                    password = password + integerSupplier.get();
                } else {
                    password = password + characterSupplier.get();
                }
            }
            return password;

        };

        System.out.println(passwordSupplier.get());
        System.out.println(passwordSupplier.get());
        System.out.println(passwordSupplier.get());

    }

}

/*
B3M8R8K4
V4@4B7I1
I8F6I4K1
 */
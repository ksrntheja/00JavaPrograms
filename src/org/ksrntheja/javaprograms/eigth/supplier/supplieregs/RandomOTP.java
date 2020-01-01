package org.ksrntheja.javaprograms.eigth.supplier.supplieregs;

import java.util.function.Supplier;

public class RandomOTP {

    public static void main(String[] args) {

        Supplier<String> otpSupplier = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };

        System.out.println(otpSupplier.get());
        System.out.println(otpSupplier.get());
        System.out.println(otpSupplier.get());

    }

}

/*
236496
717283
562198
 */
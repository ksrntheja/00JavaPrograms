package org.ksrntheja.javaprograms.eigth.primitivetypefunctionalinterfaces.supplierprimitive;

import java.util.function.IntSupplier;

public class RandomOTPPrimitiveSupplier {

    public static void main(String[] args) {

        IntSupplier randomIntSupplier = () -> (int) (Math.random() * 10);

/*        Supplier<String> otpSupplier = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };*/

        String otp = "";

        for (int i = 0; i < 6; i++) {
            otp = otp + randomIntSupplier.getAsInt();
        }

        System.out.println(otp);

    }

}

// 500782
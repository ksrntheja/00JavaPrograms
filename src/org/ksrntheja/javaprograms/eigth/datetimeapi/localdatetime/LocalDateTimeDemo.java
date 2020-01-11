package org.ksrntheja.javaprograms.eigth.datetimeapi.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : " + localDateTime);


        int dd = localDateTime.getDayOfMonth();

        // int mm = localDateTime.getMonth();
        int mm = localDateTime.getMonthValue();

        int yyyy = localDateTime.getYear();

        System.out.printf("DD-MM-YYYY : %d-%d-%d", dd, mm, yyyy);


        int hour = localDateTime.getHour();

        int minute = localDateTime.getMinute();

        int second = localDateTime.getSecond();

        int nano = localDateTime.getNano();

        System.out.printf("\nH:M:S:N -> %d:%d:%d:%d", hour, minute, second, nano);

    }

}

/*
LocalDateTime : 2020-01-11T17:17:10.723292
DD-MM-YYYY : 11-1-2020
H:M:S:N -> 17:17:10:723292000
 */
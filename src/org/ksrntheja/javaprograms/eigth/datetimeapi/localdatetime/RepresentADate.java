package org.ksrntheja.javaprograms.eigth.datetimeapi.localdatetime;

import java.time.LocalDateTime;

public class RepresentADate {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2017, 1, 11, 8, 0);
        System.out.println("11th jan 2017 8 Am -> " + localDateTime);


        System.out.println("After 3 years   : -> " + localDateTime.plusYears(3));
        System.out.println("After 6 Months  : -> " + localDateTime.plusMonths(6));
        System.out.println("Before 6 Months : -> " + localDateTime.minusMonths(6));

    }

}

/*
11th jan 2017 8 Am -> 2017-01-11T08:00
After 3 years   : -> 2020-01-11T08:00
After 6 Months  : -> 2017-07-11T08:00
Before 6 Months : -> 2016-07-11T08:00
 */
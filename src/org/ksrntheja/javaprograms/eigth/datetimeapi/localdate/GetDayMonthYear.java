package org.ksrntheja.javaprograms.eigth.datetimeapi.localdate;

import java.time.LocalDate;

public class GetDayMonthYear {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Date : " + localDate);


        System.out.println("DayOfMonth : " + localDate.getDayOfMonth());

        System.out.println("Month : " + localDate.getMonth());

        System.out.println("Year : " + localDate.getYear());


        int dd = localDate.getDayOfMonth();

        // int mm = localDate.getMonth();
        int mm = localDate.getMonthValue();

        int yyyy = localDate.getYear();

        System.out.println("DD-MM-YYYY : " + dd + "-" + mm + "-" + yyyy);

        System.out.printf("DD-MM-YYYY : %d-%d-%d", dd, mm, yyyy);

    }

}

/*
Date : 2020-01-11
DayOfMonth : 11
Month : JANUARY
Year : 2020
DD-MM-YYYY : 11-1-2020
DD-MM-YYYY : 11-1-2020
 */
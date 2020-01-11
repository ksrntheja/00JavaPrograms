package org.ksrntheja.javaprograms.eigth.datetimeapi.year;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Year year = Year.of(n);

        if (year.isLeap()) {
            // System.out.printf("%d is leap year", year);
            System.out.printf("%d is leap year", n);
        } else {
            System.out.printf("%d is not leap year", n);
        }

    }

}

/*
2020
2020 is leap year
2019
2019 is not leap year
 */
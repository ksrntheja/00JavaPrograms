package org.ksrntheja.javaprograms.eigth.datetimeapi.period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Age {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1947, 8, 15);
        LocalDate now = LocalDate.now();

        Period period = Period.between(birthday, now);

        System.out.printf("Your age is %d years %d months %d days", period.getYears(), period.getMonths(), period.getDays());


        LocalDate deathDay = LocalDate.of(1947 + 100, 8, 15);

        Period toDeath = Period.between(now, deathDay);

        int daysLeft = toDeath.getYears() * 365 + toDeath.getMonths() * 30 + toDeath.getDays();
        System.out.println("\nNumber of days left : " + daysLeft);

    }

}

/*
Your age is 72 years 4 months 27 days
Number of days left : 10069
 */
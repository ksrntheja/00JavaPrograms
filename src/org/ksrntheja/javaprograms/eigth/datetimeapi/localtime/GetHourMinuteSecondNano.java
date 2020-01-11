package org.ksrntheja.javaprograms.eigth.datetimeapi.localtime;

import java.time.LocalTime;

public class GetHourMinuteSecondNano {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime : " + localTime);

        int hour = localTime.getHour();

        int minute = localTime.getMinute();

        int second = localTime.getSecond();

        int nano = localTime.getNano();

        System.out.printf("H:M:S:N -> %d:%d:%d:%d", hour, minute, second, nano);

    }

}

// LocalTime : 17:07:31.313721
// H:M:S:N -> 17:7:31:313721000

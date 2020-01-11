package org.ksrntheja.javaprograms.eigth.datetimeapi.zoneid;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CurrentZone {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Current zone : " + zoneId);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(la);
        System.out.println(zonedDateTime);


    }

}

/*
Current zone : Asia/Kolkata
2020-01-11T06:06:53.976081-08:00[America/Los_Angeles]
 */
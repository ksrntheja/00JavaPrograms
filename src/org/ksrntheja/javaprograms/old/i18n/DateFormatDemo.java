/*
 * (16) Internationalization
 * (16 - 3) DateFormat
 */

package org.ksrntheja.javaprograms.old.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class DateFormatDemo {

    public static void main(String[] args) {

        // CE: java: java.text.DateFormat is abstract; cannot be instantiated
//        DateFormat dateFormat = new DateFormat();

        separator("Date style");
        System.out.println("Full form is: " + DateFormat.getDateInstance(0).format(new Date()));
        System.out.println("Long form is: " + DateFormat.getDateInstance(1).format(new Date()));
        System.out.println("Medium form is: " + DateFormat.getDateInstance(2).format(new Date()));
        System.out.println("Short form is: " + DateFormat.getDateInstance(3).format(new Date()));

        separator("Date style - UK, US and Italy");
        DateFormat dateFormatUK = DateFormat.getDateInstance(0, Locale.UK);
        DateFormat dateFormatUS = DateFormat.getDateInstance(0, Locale.US);
        DateFormat dateFormatItaly = DateFormat.getDateInstance(0, Locale.ITALY);
        System.out.println("UK: " + dateFormatUK.format(new Date()));
        System.out.println("US: " + dateFormatUS.format(new Date()));
        System.out.println("Italy: " + dateFormatItaly.format(new Date()));

        separator("DateTime");
        dateFormatItaly = DateFormat.getDateTimeInstance(0, 0, Locale.ITALY);
        System.out.println("Italy: " + dateFormatItaly.format(new Date()));

    }

}
/*
====================================================================================
Date style
====================================================================================
Full form is: Saturday 22 March, 2025
Long form is: 22 March 2025
Medium form is: 22 Mar 2025
Short form is: 22/03/25
====================================================================================
Date style - UK, US and Italy
====================================================================================
UK: Saturday 22 March 2025
US: Saturday, March 22, 2025
Italy: sabato 22 marzo 2025
====================================================================================
DateTime
====================================================================================
Italy: sabato 22 marzo 2025 16:52:22 Ora standard dell’India
 */

/*
 * (16) Internationalization
 * (16 - 2) NumberFormat
 */

package org.ksrntheja.javaprograms.old.i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import static org.ksrntheja.javaprograms.old.PrintSeparator.separator;

public class NumberFormatDemo {

    public static void main(String[] args) throws ParseException {

        //  CE: java: java.text.NumberFormat is abstract; cannot be instantiated
//        NumberFormat numberFormat = new NumberFormat();

        separator("Number -> Locale.ITALY");
        double d = 123456.789;
        NumberFormat numberFormatItaly = NumberFormat.getInstance(Locale.ITALY);
        System.out.println("Normal: " + d);
        System.out.println("Italy form is: " + numberFormatItaly.format(d));

        d = 123456789.016;
        separator("Currency -> IN");
        Locale india = new Locale("pa", "IN");
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(india);
        System.out.println("India form is: " + numberFormatIndia.format(d));

        separator("Currency -> US");
        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US form is: " + numberFormatUS.format(d));

        separator("Currency -> UK");
        NumberFormat numberFormatUK = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("UK form is: " + numberFormatUK.format(d));

        separator("Currency -> Default");
        System.out.println("Default form is: " + NumberFormat.getCurrencyInstance().format(d));

        separator("NumberFormat Max & Min fraction - setMaximumFractionDigits");
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        System.out.println(numberFormat.format(123.4567));
        System.out.println(numberFormat.format(123.4));

        separator("NumberFormat Max & Min fraction - setMinimumFractionDigits");
        numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumFractionDigits(2);
        System.out.println(numberFormat.format(123.4567));
        System.out.println(numberFormat.format(123.4));

        separator("NumberFormat Max & Min fraction - setMaximumIntegerDigits");
        numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumIntegerDigits(3);
        System.out.println(numberFormat.format(123456.789));
        System.out.println(numberFormat.format(1.2345));

        separator("NumberFormat Max & Min fraction - setMinimumIntegerDigits");
        numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumIntegerDigits(3);
        System.out.println(numberFormat.format(123456.789));
        System.out.println(numberFormat.format(1.2345));

        separator("parse");
        System.out.println(NumberFormat.getNumberInstance().parse("123,456,789"));


    }

}
/*
====================================================================================
Number -> Locale.ITALY
====================================================================================
Normal: 123456.789
Italy form is: 123.456,789
====================================================================================
Currency -> IN
====================================================================================
India form is: ₹123,456,789.02
====================================================================================
Currency -> US
====================================================================================
US form is: $123,456,789.02
====================================================================================
Currency -> UK
====================================================================================
UK form is: £123,456,789.02
====================================================================================
Currency -> Default
====================================================================================
Default form is: ₹123,456,789.02
====================================================================================
NumberFormat Max & Min fraction - setMaximumFractionDigits
====================================================================================
123.46
123.4
====================================================================================
NumberFormat Max & Min fraction - setMinimumFractionDigits
====================================================================================
123.457
123.40
====================================================================================
NumberFormat Max & Min fraction - setMaximumIntegerDigits
====================================================================================
456.789
1.234
====================================================================================
NumberFormat Max & Min fraction - setMinimumIntegerDigits
====================================================================================
123,456.789
001.234
====================================================================================
parse
====================================================================================
123456789
 */

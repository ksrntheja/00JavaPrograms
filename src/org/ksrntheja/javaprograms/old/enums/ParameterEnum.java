/*
 * (17) Enum
 * (7 - 1) Enum Parameter
 */

package org.ksrntheja.javaprograms.old.enums;

public class ParameterEnum {

    public static void main(String[] args) {

    }

}

enum BeerConstructorParameter01 {

    KF(100), KO(90), RC(95), FO;

    int price;

    BeerConstructorParameter01(int price) {
        this.price = price;
    }

    BeerConstructorParameter01() {
        this.price = 65;
    }

    public int getPrice() {
        return price;
    }

}

class BeerConstructorParameterDemo01 {


    public static void main(String[] args) {

        BeerConstructorParameter01[] beerConstructorParameter = BeerConstructorParameter01.values();
        for (BeerConstructorParameter01 parameter : beerConstructorParameter) {
            System.out.println(parameter + "..." + parameter.getPrice());
        }

        System.out.println(BeerConstructorParameter01.KF.equals(BeerConstructorParameter01.RC));
        System.out.println(BeerConstructorParameter01.KF == BeerConstructorParameter01.RC);

        /*
        java: bad operand types for binary operator '>'
            first type:  org.ksrntheja.javaprograms.old.enums.BeerConstructorParameter01
            second type: org.ksrntheja.javaprograms.old.enums.BeerConstructorParameter01
        System.out.println(BeerConstructorParameter01.KF > BeerConstructorParameter01.RC);
         */

        System.out.println(BeerConstructorParameter01.KF.hashCode() > BeerConstructorParameter01.RC.hashCode());

        System.out.println(BeerConstructorParameter01.KF.ordinal() > BeerConstructorParameter01.RC.ordinal());

        System.out.println(BeerConstructorParameter01.KF.ordinal());
        System.out.println(BeerConstructorParameter01.RC.ordinal());

    }

}

/*
KF...100
KO...90
RC...95
FO...65
false
false
false
false
0
2
 */

// java: modifier abstract not allowed here
//abstract enum BeerConstructorParameter02 {

enum BeerConstructorParameter02 {

    KF(100), KO(90), RC(95), FO;

//    public abstract int getPriceAbs();

    int price;

    BeerConstructorParameter02(int price) {
        this.price = price;
    }

    BeerConstructorParameter02() {
//        this.price = 65;
    }

    public int getPrice() {
        return price;
    }

}

class BeerConstructorParameterDemo02 {


    public static void main(String[] args) {

        BeerConstructorParameter02[] beerConstructorParameter = BeerConstructorParameter02.values();
        for (BeerConstructorParameter02 parameter : beerConstructorParameter) {
            System.out.println(parameter + "..." + parameter.getPrice());
        }

    }

}

/*
KF...100
KO...90
RC...95
FO...0
 */

enum Color01 {

    BLUE, RED, GREEN;

    public void info() {
        System.out.println("Universal Color");
    }

}

class ColorDemo01 {

    public static void main(String[] args) {

        Color01[] colors = Color01.values();
        for (Color01 color : colors) {
            color.info();
        }

    }

}

/*
Universal Color
Universal Color
Universal Color
 */


enum Color02 {

    BLUE, RED {
        public void info() {
            System.out.println("Dangerous Color");
        }
    }, GREEN;

    public void info() {
        System.out.println("Universal Color");
    }

}

class ColorDemo02 {

    public static void main(String[] args) {

        Color02[] colors = Color02.values();
        for (Color02 color : colors) {
            color.info();
        }

    }

}

/*
Universal Color
Dangerous Color
Universal Color
 */

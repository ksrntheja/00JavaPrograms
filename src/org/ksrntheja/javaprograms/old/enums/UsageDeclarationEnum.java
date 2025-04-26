/*
 * (17) Enum
 * (1 - 2) Declaration
 */

package org.ksrntheja.javaprograms.old.enums;

// CE: java: modifier private not allowed here
//private enum E1 {

// CE: java: modifier protected not allowed here
//protected enum E1 {

// CE: java: modifier static not allowed here
//static enum E1 {

// CE: java: modifier final not allowed here
//final enum E1 {

// CE: java: modifier abstract not allowed here
//abstract enum E1 {

enum E1 {
    One;
}

strictfp enum E2 {
    Two;
}

public class UsageDeclarationEnum {

    public enum E3 {
        Three;
    }

    enum E4 {
        Four;
    }

    strictfp enum E5 {
        Five;
    }

    private enum E6 {
        Six;
    }

    protected enum E7 {
        Seven;
    }

    static enum E8 {
        Eight;
    }

    // CE: java: modifier final not allowed here
//    final enum E9 {

    // CE: java: modifier abstract not allowed here
//    abstract enum E10 {

    public void m1() {

//        public enum E11 {

        enum E12 {
            Twelve;
        }

        strictfp enum E13 {
            Thirteen;
        }

//        private enum E14 {

//        protected enum E15 {

//        static enum E16 {

//        final enum E17 {

//        abstract enum E18 {


        System.out.println(E12.Twelve);
        System.out.println(E13.Thirteen);

    }


    public static void main(String[] args) {

        System.out.println(E1.One);
        System.out.println(E2.Two);
        System.out.println(E3.Three);
        System.out.println(E4.Four);
        System.out.println(E5.Five);
        System.out.println(E6.Six);
        System.out.println(E7.Seven);
        System.out.println(E8.Eight);

        UsageDeclarationEnum usageDeclarationEnum = new UsageDeclarationEnum();
        usageDeclarationEnum.m1();

        System.out.println(EnumPublic.One);

    }
}

/*
One
Two
Three
Four
Five
Six
Seven
Eight
Twelve
Thirteen
One
 */

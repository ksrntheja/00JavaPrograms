/*
 * (17) Enum
 * (2 - 1) switch
 */

package org.ksrntheja.javaprograms.old.enums;

public class SwitchEnum {

    public static void main(String[] args) {

        String JAVA = "JAVA";
        Beer beer = Beer.RC;
        switch (beer) {
            case KF:
                System.out.println("Its KF");
                break;

            case KO:
                System.out.println("Its KO");
                break;

            case RC:
                System.out.println("Its RC");
                break;

            case FO:
                System.out.println("Its FO");
                break;

//            case JAVA:
//                System.out.println("Its FO");
//                break;
//            CE: java: java: incompatible types: java.lang.String cannot be converted to org.ksrntheja.javaprograms.old.enums.Beer

            default:
                System.out.println("Its None");
                break;
        }


    }
}

/*
Its RC
 */

package org.ksrntheja.javaprograms.eigth.function.chain.functionchainingeg;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuthenticationByUsingFunctionChaining {

    public static void main(String[] args) {

        Function<String, String> f1 = s -> s.toLowerCase();
        Function<String, String> f2 = s -> s.substring(0, 5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name:");
        String username = sc.next();

        System.out.println("Enter Password:");
        String pwd = sc.next();

        if (f1.andThen(f2).apply(username).equals("theja") && pwd.equals("java")) {
            System.out.println("Valid User");
        } else {
            System.out.println("Invalid User");
        }
    }

}
    
/*
Enter User Name:
THeJa
Enter Password:
java
Valid User

Enter User Name:
ghhghghghg
Enter Password:
hhhhh
Invalid User
 */
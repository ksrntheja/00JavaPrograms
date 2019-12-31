package org.ksrntheja.javaprograms.eigth.predicate.predicateegs;

import java.util.Scanner;
import java.util.function.Predicate;

class User {

    String username;
    String pwd;

    User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

}


public class UserAuthenticationPredicate {

    public static void main(String[] args) {

        Predicate<User> userPredicate = user -> user.username.equals("THEJA") && user.pwd.equals("KSRN");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name:");
        String username = sc.next();
        System.out.println("Enter Password:");
        String pwd = sc.next();
        User user = new User(username, pwd);

        if (userPredicate.test(user)) {
            System.out.println("Valid user and can avail all services");
        } else {
            System.out.println("invalid user you cannot avail services");
        }

    }

}

/*
Enter User Name:
KSRN
Enter Password:
THEJA
invalid user you cannot avail services

Enter User Name:
THEJA
Enter Password:
KSRN
Valid user and can avail all services
 */
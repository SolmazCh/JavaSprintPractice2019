package day17_WhileLoops;

import java.util.Scanner;

public class credentials {

    public static void main(String[] args) {

     /*
     user: cybertek
     pass: cybertek123
      */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");

        String username = scan.next();

        System.out.println("Enter password");

        String password = scan.next();

        boolean valid =(username.equals("cybertek") && password.equals("cybertek123")); //false
                 // validating first username and password

        int count = 1;
        while(!valid) {

            System.out.println("Please re-enter your credentials");

            System.out.println("Enter username");

            username = scan.next();

            System.out.println("Enter password");

            password = scan.next();

            valid = (username.equals("cybertek") && password.equals("cybertek123"));
            // validating new username and password


            count++;
            if (count == 3 && !valid) {
                System.out.println("Your account is locked");
                break;
            }


        }
            if(valid){
                System.out.println("Logged in");
            }









    }
}

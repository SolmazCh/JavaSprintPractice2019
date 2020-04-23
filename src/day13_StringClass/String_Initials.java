package day13_StringClass;

import java.util.Scanner;

public class String_Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");

        String firstname = scan.next();

        System.out.println("Enter your last name:");

        String lastname = scan.next();


        String initials =firstname.substring(0, 1).toUpperCase().concat(lastname.substring(0, 1).toUpperCase());


        System.out.println(initials);



    }
}

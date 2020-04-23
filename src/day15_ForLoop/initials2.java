package day15_ForLoop;

import java.util.Scanner;

public class initials2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");

        String firstname = scan.next();

        System.out.println("Enter your last name:");

        String lastname = scan.next();

        String result ="";

        result = firstname.substring(0,1).concat(lastname.substring(0,1));

       result= result.toUpperCase();

        System.out.println(result);





    }
}

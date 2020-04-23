package day15_ForLoop;

import java.util.Scanner;

public class initials {

    /*1. write a program that asks user's first and last name, then prints out the initials of the user

			Ex:
				input:
					cybertek
					batch12

				output:your initial is: CB
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");

        String firstName = scan.next();

        System.out.println("Enter your last name:");

        String lastName =  scan.next();


        String initials = firstName.substring(0,1) + lastName.substring(0,1);

                initials = initials.toUpperCase();

                String initials2 =""+ firstName.charAt(0)+lastName.charAt(0);

                       initials2 = initials2.toUpperCase();

        System.out.println(initials2);

        System.out.println(initials);






    }
}

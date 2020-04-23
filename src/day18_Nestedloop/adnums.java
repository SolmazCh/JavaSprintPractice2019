package day18_Nestedloop;

import java.util.Scanner;

public class adnums {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) {


            System.out.println("Enter two numbers");

            int a = scan.nextInt();

            int b = scan.nextInt();


            System.out.println("Your addition of numbers is: " + (a + b));

            System.out.println("Do you want to continue?");

            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

                System.out.println("Invalid entry, please re-enter");

                answer = scan.next();
            }


            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you");

                break;
            }

        }








    }
}

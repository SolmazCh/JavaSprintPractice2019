package day18_Nestedloop;

import java.util.Scanner;

public class Nested_Loop_Practice {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("Enter two numbers");

            int num1 = scan.nextInt();

            int num2 = scan.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));

            System.out.println("Do you want to continue?");

            String answer = scan.next();

            while ( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no") ) ){
                System.out.println("Invalid entry, please enter yes or no");
                answer =scan.next();
            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the calculator");
                break;
            }


        }


        /*
        write a program for the room reservatiob

        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$

        should as which bedroom do you wanna reserve
        if user provided invalid entry ==> please re-enter

        calculate the total price

        do you wanna reserve another room?
        if yes ==> repeat the previous steps
        if no ==> your total price is: $$$

        if answer either yes or no ==> please re-enter
        */






































    }
}

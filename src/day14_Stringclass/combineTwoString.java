package day14_Stringclass;

import java.util.Scanner;

public class combineTwoString {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter two numbers by word:");

        String num1 = scan.next();

        String num2 = scan.next();

        String twonumbers = num1.concat(num2).concat(num2).concat(num1);

        System.out.println(twonumbers);


        System.out.println("Enter two numbers");

        String number1 = scan.next();

        String number2 = scan.next();

       String  combineword = number1.concat(" "+number2).concat(" "+number2).concat(" "+number1);

        System.out.println(combineword);










    }
}

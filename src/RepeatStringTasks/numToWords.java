package RepeatStringTasks;

import java.util.Scanner;
/* 2. write a java program that can convert any given numbers between 1 ~ 5 to words,
 if the number is greater than 5 or less than zero, out put should be "Invalid".*/
public class numToWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the number");

        int num = scan.nextInt();

        switch (num){

            case(1):
                System.out.println("one");
            break;

            case(2):
                System.out.println("two");
            break;

            case(3):
                System.out.println("three");
            break;

            case(4):
                System.out.println("four");
            break;

            case(5):
                System.out.println("five");
            break;

            default:
                System.out.println("Invalid");


        }
















    }
}

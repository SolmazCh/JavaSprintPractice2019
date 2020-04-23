package day17_WhileLoops;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {
/*1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will need for loop and if statement

	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement*/
    Scanner input = new Scanner(System.in);


        int MaxNum = -1999999999; // any number the user provided will be greater than this number
                 // first user entered variable will be initialized to MaxNum

        int MinNum =1999999999;
        for(int i=1; i<=5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();  // 0,1,2,3,4

            if(num>MaxNum){   // to compare each user inputs, assign the maximum number to maxNum
                MaxNum = num;
            }

            if(num<MinNum){
              MinNum = num;
            }
        }

        System.out.println("Maximum number: "+MaxNum);
        System.out.println("Minimum number: "+MinNum);


    }
}

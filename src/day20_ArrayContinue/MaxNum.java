package day20_ArrayContinue;

import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {

          // write a program that can find the maximum number from any given int array

        Scanner scan =new Scanner(System.in);

        int[] number = new int[3];

        int MaxNum = -29999999;

        int MinNum = 299999999;

        for(int i=0; i<3; i++) {

            System.out.println("Enter a number");

          number[i] = scan.nextInt();

            if (number[i]> MaxNum) {
                MaxNum = number[i];
            }

            if(number[i] < MinNum){
                MinNum =number[i];
            }
        }
            System.out.println("Maximum number is: "+MaxNum);

            System.out.println("Minimum number is: "+MinNum);



















    }

}

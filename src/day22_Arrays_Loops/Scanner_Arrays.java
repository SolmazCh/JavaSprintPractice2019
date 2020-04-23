package day22_Arrays_Loops;

import java.util.Scanner;
/*
1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
 */

public class Scanner_Arrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] arr = new String[5];

        System.out.println("Enter 5 words:");

        for(int i =0; i<arr.length; i++){

            arr[i] = scan.next();
        }

        for(String eachword : arr){
            System.out.println(eachword.substring(0,3));
        }











    }
}
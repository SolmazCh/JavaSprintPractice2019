package day19_Arrays;

import java.util.Scanner;

public class Arrays_students {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // write a program that asks "enter a name" 10 times, and store each of the names in the array students

        String[] name = new String [10];

        for(int i=0; i<name.length; i++){

            System.out.println("Enter a name");

             name[i] = scan.nextLine();

        }

        System.out.println(name[2]);





        
    }
}

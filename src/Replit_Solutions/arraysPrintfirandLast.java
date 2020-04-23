package Replit_Solutions;

import java.util.Scanner;
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

 */

public class arraysPrintfirandLast {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

  for(int i=0; i<words.length; i++) {

    System.out.println(words[i].substring(0, 1) + words[i].substring(words[i].length() - 1));


  }




    }
}

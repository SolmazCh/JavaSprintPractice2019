package day15_ForLoop;

import java.util.Scanner;

public class palindrome {

         /*
        write a programm to identify if a string is palindrome   if yes ==>true, otherwise ==> false
               level ==> level ==> palindrome (2 yoluda equal and equalsensitive ele!)
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");

        String word = scan.nextLine();

        String reversedWord = "";

        for(int i = word.length()-1 ; i >=0; i-- ) {

            reversedWord += word.charAt(i);
        }

        boolean palindrome = word.equalsIgnoreCase(reversedWord);


        System.out.println(palindrome);
















    }
}

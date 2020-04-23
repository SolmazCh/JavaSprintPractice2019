package day14_Stringclass;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

/*
3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
			Input:
				abba

			Output:
				true
 */


        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a word:");

        String word = scan.next();

        boolean result = word.charAt(0) == word.charAt(word.length()-1);

        if(result){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



    }


}

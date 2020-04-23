package Replit_Solutions;

import java.util.Scanner;

public class Count_JavaLoop {
    /*
    Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int result = 0;

        for (int i = 0; i < word.length() - 1; i++) {

            if (word.contains("java")) {
                word.replaceFirst("java", "");
                result += i;
            }



        }

        System.out.println(result);



    }
}
package day23_Methods;

import day11_Scanner.Scanner_2words;

import java.util.Scanner;

public class PalindromMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        palindrome(word);
    }


    public static void palindrome(String word){


        String result ="";

        for(int i=word.length()-1; i>=0; i--){
            result+=""+word.charAt(i);

        }


        System.out.println(result.equalsIgnoreCase(word) );




    }










}

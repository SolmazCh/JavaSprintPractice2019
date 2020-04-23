package day11_Scanner;

import java.util.Scanner;

public class Scanner_2words {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first word: ");

        String word1 = scan.next();

        System.out.println("Enter the second word: ");

        String word2 = scan.next();

        System.out.println("You entered: "+word1+word2);







    }
}

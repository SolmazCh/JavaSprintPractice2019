package Replit_Solutions;

import java.util.Scanner;

public class lastletter {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        String word = scan.next();

       char ch = word.charAt(word.length()-1);

        System.out.println(ch);






    }
}

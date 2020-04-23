package day14_Stringclass;

import java.util.Scanner;

public class warmup2 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter two words");

        String word1 = scan.next();

        String word2 = scan.next();

        String words = word1.substring(1).concat(word2.substring(1));

        System.out.println(words);


        System.out.println("Enter two words");

        String wordfirst = scan.next();

        String wordsecond = scan.next();











    }
}

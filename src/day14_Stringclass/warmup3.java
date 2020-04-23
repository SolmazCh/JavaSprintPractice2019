package day14_Stringclass;

import java.util.Scanner;

public class warmup3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the word");

        String word = scan.next();

        int lengh = word.length();

        char middleodd = word.charAt(word.length()/2);

        char middleeven = word.charAt(word.length()/2-1 +word.length()/2) ;

        if(word.length()%2 == 0){

            System.out.println(middleeven);
        }else{
            System.out.println(middleodd);
        }








    }
}

package Replit_Solutions;

import java.util.Scanner;

public class middlechar {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();



        if (word.length() % 2 != 0 && word.length() >= 5) {

            String s1 = word.substring(word.length()/2-1, word.length()/2+2);

            System.out.println(s1);

        } else {
            System.out.println("invalid");
        }



           




    }


    }

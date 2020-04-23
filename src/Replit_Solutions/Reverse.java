package Replit_Solutions;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        String result ="";


            if (word.length() < 5) {
                result = "Too short!";

            } else if (word.length() > 5) {
                result = "Too long!";
            }


            for(int i=word.length()-1; i>=0; i--){
                result+=word.charAt(i);
            }



        System.out.println(result);
































        }

    }



package Replit_Solutions;

import java.util.Scanner;

public class withoutX_String {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        String result ="";

        boolean  startWith = (""+ word.charAt(0)).equalsIgnoreCase("x");

        boolean endWith = (""+word.charAt(word.length()-1)).equalsIgnoreCase("x");

        if(startWith){
            result = word.substring(1);
        }else if(endWith){
            result = word.substring(0,word.length()-1);
        }else if (startWith && endWith){
            result =word.substring(1,word.length()-1);
        }else{
            result = word;
        }

        System.out.println(result);


    }

}
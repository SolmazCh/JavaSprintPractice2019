package day14_Stringclass;

import java.util.Scanner;

public class ChechWords {
    /*1. Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
*/

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = scan.next();

        System.out.println("Enter second word");
        String word2 = scan.next();

        System.out.println("Enter third word");
        String word3 = scan.next();


        int lenght1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        boolean allnotsame = lenght1 != length2 && length2 !=length3 && lenght1 != length3;


        if(lenght1 == length2 && length2==length3){
            System.out.println("All words are same lengths");
        }else if(allnotsame){
            System.out.println("All different lengths");
        }else{
            System.out.println("Not same nor different lengths");
        }













    }




}


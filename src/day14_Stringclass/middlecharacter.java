package day14_Stringclass;

import java.util.Scanner;

public class middlecharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");

        String word = scan.next(); // Cyber

        String middleCharacter =""; // to store the middle characters at the end

        int totalChar = word.length();  //5

        int middleNumber = totalChar/2;  // 5/2 ==>

        if (totalChar%2 !=0) {  //odd numbers
            middleCharacter = middleCharacter+ word.charAt(middleNumber);
            // middleCharacter +=  word.charAt(middleNumber);
        }else{
           // middleCharacter = middleCharacter+ word.charAt(middleNumber-1)+word.charAt(middleNumber);
            middleCharacter += word.charAt(middleNumber-1)+ ""+ word.charAt(middleNumber);
        }

        System.out.println(middleCharacter);









    }
}

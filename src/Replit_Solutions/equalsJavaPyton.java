package Replit_Solutions;

import java.util.Scanner;

public class equalsJavaPyton {

    public static void main(String[] args) {

        /*
        nstructions from your teacher:
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
         */

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countjava =0;
        int countpython =0;

        for(int i=0; i<sentence.length(); i++) {

            if (sentence.contains("java") ){
                countjava+=sentence.charAt(i);
            }

            if(sentence.contains("python")){
                countpython+=i;
            }

        }

        System.out.println(countjava);
        System.out.println(countpython);






    }
}

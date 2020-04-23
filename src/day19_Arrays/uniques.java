package day19_Arrays;

public class uniques {
/*
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */
    public static void main(String[] args) {

        String str = "ABABC";

        String result ="";  //"C"

        for(int j=0; j< str.length(); j++) {

            int count = 0; // to count the occurrence of the character

            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) { // check how many times the character occurred in the String
                    count++;
                }
            }

                if (count == 1) {
                    result += str.charAt(j);
                }

            }


            System.out.print(result);











    }


}

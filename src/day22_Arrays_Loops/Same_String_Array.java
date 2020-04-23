package day22_Arrays_Loops;

import java.util.Arrays;

public class Same_String_Array {

    /*
     write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods

     */

    public static void main(String[] args) {


        String str1 = "aabbbc";


        String str2 = "bac";

        String nonDub ="";

        String nonDub2="";

        for(int i=0; i<str1.length(); i++){

            if(!nonDub.contains(""+str1.charAt(i))){
                nonDub+=str1.charAt(i);
            }
        }


        for(int i=0; i<str2.length(); i++){

            if(!nonDub2.contains(""+str2.charAt(i))){
                nonDub2+=str2.charAt(i);
            }
        }


        char[] ch1 =nonDub.toCharArray();

        char[]  ch2 =nonDub2.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);


        System.out.println(Arrays.equals(ch1,ch2));















    }
}

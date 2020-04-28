package Replit_Solutions;

import java.util.Arrays;

public class anagram195 {

    public static void main(String[] args) {

        String word1 ="Star";
        String word2 ="rats";

        word1 = word1.replaceAll(" ","");
        word2 =word2.replaceAll(" ","");


        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        String str1 =Arrays.toString(ch1);
        String str2 =Arrays.toString(ch2);

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }

    }








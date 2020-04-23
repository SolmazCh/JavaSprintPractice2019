package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String name ="Java";  // 'J', 'a', 'v', 'a'

        char[] chars = name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[3]);

       // System.out.println(chars[4]);

        String str = "I like Java";

        String[] arr = str.split(" ");


        System.out.println(Arrays.toString(arr));


        /*
        reverse sentence day great is today
         */

        String sentence ="Today is a great day";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String result ="";
        for(int i=words.length-1; i>=0; i--) {
            String eachWords = words[i];
            result+=words[i]+" ";

        }

        System.out.println(result);


        String str2 = "ABCD";
                               // ["A", "B", "C", "D"]

        String[] arr2 = str2.split("");

        char[] ch2 =str2.toCharArray(); //

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));









    }
}

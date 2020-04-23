package day20_ArrayContinue;

import  java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Solmaz";

       char[] characters = name.toCharArray();

        System.out.println(Arrays.toString(characters));


        String str1 = "Cybertek School";
        String str2 = "School Cybertek";


        char[] ch1 =str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);// [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]
        Arrays.sort(ch2);// [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

    boolean equalStr = Arrays.equals(ch1,ch2);

        System.out.println(equalStr);






    }
}

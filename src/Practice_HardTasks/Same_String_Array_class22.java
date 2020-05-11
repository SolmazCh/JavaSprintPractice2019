package Practice_HardTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Same_String_Array_class22 {
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

        String str1 ="aabbbc";
        String str2 ="cabbc";

        String nonDup1="";
        String nonDup2="";

        for(int i=0; i<str1.length(); i++){
            if(!nonDup1.contains(str1.charAt(i)+"")){
                nonDup1+=str1.charAt(i);
            }
        }
        for(int i=0; i<str2.length(); i++){
            if(!nonDup2.contains(str2.charAt(i)+"")){
                nonDup2+=str2.charAt(i);
            }
        }

        char[] ch1 = nonDup1.toCharArray();
        char[] ch2 = nonDup2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));

    }
}
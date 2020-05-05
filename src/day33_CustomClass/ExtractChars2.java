package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class ExtractChars2 {
    /*
    4. write a program that can extract the special characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:

        DO NOT USE LOOPS
     */
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char[] ch = str.toCharArray();
        ArrayList<Character> character = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> abc = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
          char each=str.charAt(i);
            if (Character.isDigit(each)) {
                digits.add(each);
            } else if (Character.isLetter(each)) {
                abc.add(each);
            } else {
                character.add(each);
            }
        }










        System.out.println(character);
        System.out.println(digits);
        System.out.println(abc);











    }
}

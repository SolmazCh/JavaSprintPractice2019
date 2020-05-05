package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars {
    /*
    3. write a program that can extract the special characters, digits and alphabets from a string
     and stores them into separate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA

     */
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        char[] ch = str.toCharArray();

        ArrayList<Character> character = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> abc = new ArrayList<>();

        for(char each: ch) {
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

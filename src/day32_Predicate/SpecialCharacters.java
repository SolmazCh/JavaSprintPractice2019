package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class SpecialCharacters {
    /*
    4. write a program that can extract the special characters,
    digits and alphabets from a string and stores them into separate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> abc = new ArrayList<>();
        ArrayList<Character> character = new ArrayList<>();
        char[] ch=str.toCharArray();

        for(int i=0; i<ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                digits.addAll(Arrays.asList(ch[i]));
            } else if (Character.isAlphabetic(ch[i])) {
                abc.addAll(Arrays.asList(ch[i]));
            } else {
                character.addAll(Arrays.asList(ch[i]));
            }
        }
            System.out.println(digits);
            System.out.println(abc);
            System.out.println(character);



    }
}

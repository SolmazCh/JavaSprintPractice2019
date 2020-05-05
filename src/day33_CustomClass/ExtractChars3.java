package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ExtractChars3 {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char arr[] = str.toCharArray();

        Character[] ch = new Character[arr.length];
        for(int i=0; i<arr.length; i++){
            ch[i] =arr[i];
        }

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(p-> !Character.isDigit(p));

        ArrayList<Character> abc = new ArrayList<>(Arrays.asList(ch));
        abc.removeIf(p-> !Character.isLetter(p));

        ArrayList<Character> character = new ArrayList<>(Arrays.asList(ch));
        character.removeAll(abc);
        character.removeAll(digits);
        character.removeIf(p-> Character.isLetterOrDigit(p));


        System.out.println(character);
        System.out.println(digits);
        System.out.println(abc);





    }
}

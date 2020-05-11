package Practice_HardTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SpecialCharacters_class32 {
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

          String str ="ABCD123$%#@&456EFG!";

          ArrayList<String> digits = new ArrayList<>();
          ArrayList<String> letters = new ArrayList<>();
          ArrayList<String> characters = new ArrayList<>();

          for(int i=0; i<str.length(); i++){
               if(Character.isDigit(str.charAt(i))){
                    digits.add(str.charAt(i)+"");
               }else if(Character.isLetter(str.charAt(i))){
                    letters.add(str.charAt(i)+"");
               }else{
                    characters.add(str.charAt(i)+"");
               }
          }

          System.out.println(digits);
          System.out.println(letters);
          System.out.println(characters);




     }
}

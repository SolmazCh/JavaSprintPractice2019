package Practice_HardTasks;

import java.util.ArrayList;
import java.util.Arrays;

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

          String str = "ABCD123$%#@&456EFG!";

          ArrayList<Character> digits = new ArrayList<>();
          ArrayList<Character> characters =new ArrayList<>();
          ArrayList<Character> abc = new ArrayList<>();

          char[] arr = str.toCharArray();

          System.out.println(Arrays.toString(arr));

          for(int i=0; i<arr.length; i++){
               if(Character.isDigit(i)){
                    digits.add(arr[i]);
               }else if(Character.isLetter(arr[i])){
                    abc.add(arr[i]);
               }else {
                    characters.add(arr[i]);
               }
          }


          System.out.println(characters);
          System.out.println(abc);
          System.out.println(digits);

     }
}

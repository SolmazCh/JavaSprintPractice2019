package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
/*
	write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */

public class dublicateValue {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "D"));
        ArrayList<String> nonDup = new ArrayList<>();

        for(int i=0; i<list.size(); i++) {
            int count = 0;
            for (int k = 0; k < list.size(); k++) {
                if (list.get(i).equals(list.get(k))) {
                    count++; } }
              if (count > 1 && !nonDup.contains(list.get(i))) {
                nonDup.add(list.get(i));
                        } }
              System.out.println(nonDup);




    }
}
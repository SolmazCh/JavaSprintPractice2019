package Practice_HardTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateValue_32class {
    /*
	write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */
    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "D","D"));

        System.out.println(list);

        ArrayList<String > nonDup = new ArrayList<>();

        for(String each: list) {
            int count = Collections.frequency(list, each);

            if (count== 1 && !nonDup.contains(each)) {
                nonDup.add(each);
            }
        }
            System.out.println(nonDup);









    }
}

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

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));

        ArrayList<String> nonDup = new ArrayList<>();

        System.out.println(list);

        list.removeIf(p-> Collections.frequency(list,p)<2);

        for(String each:list){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        System.out.println(list);
        System.out.println(nonDup);

    }
}

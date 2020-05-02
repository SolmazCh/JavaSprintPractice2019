package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class uniqueFromArrayList {
    /*
    write a program that can return the unique objects from an Array List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList
     */
    public static void main(String[] args) {

        Predicate<Integer> unique = p -> p!=1;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5)); //{2,3,4}

       int count = Collections.frequency(list,0);



          list.removeIf(unique);

        System.out.println(list);


















    }
}

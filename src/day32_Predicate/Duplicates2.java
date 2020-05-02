package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D","D"));

        ArrayList<String > result = new ArrayList<>();

        for(String each:list){
            int count= Collections.frequency(list,each );
            if(count>1 && !result.contains(each)){
                result.add(each);
            }

        }
        System.out.println(result);


        System.out.println("========================================================");

        ArrayList<String> list2 = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D","D"));

        ArrayList<String > result2 = new ArrayList<>();

        for(int i=0; i<list2.size(); i++) {
            int count2 = Collections.frequency(list,list2.get(i));
            if(count2>1 && !result2.contains(list2.get(i))){
                result2.add(list2.get(i));
            }
        }
        System.out.println( result);


    }
}

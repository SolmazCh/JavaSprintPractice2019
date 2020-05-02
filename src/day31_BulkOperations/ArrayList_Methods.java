package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> list1 =new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

      boolean bl=list1.contains("D");  //true

        System.out.println(bl);


        ArrayList<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        Collections.sort(list1);  // sort arraylist in ascending order,  // java.util package
        Collections.sort(list2);
        boolean bl2 =list1.equals(list2); //true
        System.out.println(bl2);

        int[] arr1 ={1,2,3};
        int[] arr2 ={3,2,1};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       boolean bl3 = Arrays.equals(arr1,arr2);
        System.out.println(bl3);

        System.out.println("===================================================================");


        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);

        Collections.sort(list3);

        ArrayList<Integer> list4 = new ArrayList<>();

        for(int i=list3.size()-1; i>=0; i--){
            list4.add(list3.get(i));
        }

        System.out.println(list4);

        boolean bl5 = list4.isEmpty(); // false
        System.out.println(bl5);

        list4.clear();
        System.out.println(list4.isEmpty()); //true

    }
}

package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        //add 30,20,40,50,45,35,200

     /*   list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(45);
        list1.add(35);
        list1.add(200);*/

      //  list1.addAll(Arrays.asList(30,20,40,50,45,35,200));

        Integer[] data ={30,20,40,50,45,35,200};
        list1.addAll(Arrays.asList(data)); // accept only object type(Integer or Character) , collections only, not primitive as int or char,

        System.out.println(list1);

        System.out.println("=======================================================");


        String[] names ={"Murtaza","Madina","Phu","Saim"};

        ArrayList<String > list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(names));
        System.out.println(list2);

        list2.add("Osman");
        System.out.println(list2);
        list2.remove("Murtaza");
        System.out.println(list2);

        System.out.println("======================================================");

        Integer[] numbers ={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));

        System.out.println(numList);








    }
}

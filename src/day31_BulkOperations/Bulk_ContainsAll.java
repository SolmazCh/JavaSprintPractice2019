package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        /*boolean bl =list1.contains(10);
        boolean bl2 =list1.contains(20);
        boolean result = bl==true && bl2==true;
        System.out.println(result);*/

       boolean bl3 = list1.containsAll(Arrays.asList(10,20,1));


        System.out.println(bl3);

        Integer[] data ={10,20,40};

        boolean b1 = list1.containsAll(Arrays.asList(data));
        System.out.println(b1);


    }
}

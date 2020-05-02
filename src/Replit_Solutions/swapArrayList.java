package Replit_Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class swapArrayList {
    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        String str1 = list.get(0);
        String str2 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);

        list.set(0,str2);
        list.set(2,str1);
        System.out.println(list);






    }
}

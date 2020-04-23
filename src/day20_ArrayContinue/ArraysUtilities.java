package day20_ArrayContinue;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String args[]) {

        int[] arr ={1,2,3};

      String str =  Arrays.toString(arr);

        System.out.println(str);

        System.out.println(arr);  // array must be converted to string before we print!!

        String names[] = {"Madina", "Fatih", "Solmaz"};

        System.out.println(names); // it will return you hashtags not the names in String

        System.out.println(Arrays.toString(names)); // but it will return you names in String



        double[] nums ={10,20,30,40,50};

        System.out.println(nums); //hashtags not numbers

        System.out.println(Arrays.toString(nums)); // 10.0, 20,0 ... as double numbers

        System.out.println(nums[0]);  // 10.0

        System.out.println(nums[0]+1);  // 10.0+1=11.0




    }
}

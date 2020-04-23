package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

     /*
     Arrays.sort();  sorts the array in ascending order
     Arrays.equal();
     Arrays.toString():

     Arrays.deepToString();
      */

        int[] arr ={9,10,8,65,8,6,5};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] salaries ={100_000,2_000_000,5_000_000,250_000,123_123 };

        int length = salaries.length;

       int lastIndex = length-1;

       Arrays.sort(salaries);

        System.out.println("Minimum salary: "+salaries[0]);
        System.out.println("Maximum salary: "+salaries[lastIndex]);

        System.out.println("===============================================================");

        int[] arr1 ={3,2,1};
        int[]  arr2 ={2,1,3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));









    }
}

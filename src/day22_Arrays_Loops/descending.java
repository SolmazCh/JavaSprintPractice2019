package day22_Arrays_Loops;

import java.util.Arrays;
/*
2. write a program that sort the array in descending order
reverse the arrey that is sorted to assending order
 */

public class descending {

    public static void main(String[] args) {

        int[] arr ={5,3,6,9,0,5,3,2};

        Arrays.sort(arr);

        int[] Revarr = new int[arr.length];

        int j = arr.length-1;


       for(int i=0; i<arr.length; i++){
           Revarr[i]=arr[j];
           j--;
       }

        System.out.println(Arrays.toString(Revarr));










    }
}

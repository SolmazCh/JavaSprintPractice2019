package day22_Arrays_Loops;

import java.util.Arrays;

public class unique_Array {
    /*
   1. Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3
   2.Write a program that can print out the unique values from  String Array
     */

    public static void main(String[] args) {


        int[] arr = {1,1,2,3,3};  //2

        for(int i=0; i<arr.length; i++){

            int count=0;

            for(int k=0; k<arr.length; k++){

                if(arr[i]==arr[k]){
                    count++;
                }
            }

                 if(count==1){
                     System.out.println(arr[i]);
                 }
        }











    }
}

package day23_Methods;

import java.util.Arrays;

public class decending_array {
    public static void main(String[] args) {
        decendingArray();

    }




    public static void decendingArray(){

       int[]  numbers = {1,4,7,8,0,7,5,3,2,5,6,7,8,9};

        Arrays.sort(numbers);

        int[] reverse = new int[numbers.length];



        int j=0;
        for(int i=numbers.length-1; i>=0; i--){
            reverse[j]=numbers[i];
          j++;
        }

        System.out.println(Arrays.toString(reverse));

    }




















}

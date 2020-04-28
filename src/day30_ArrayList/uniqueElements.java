package day30_ArrayList;

import java.util.ArrayList;

public class uniqueElements {
    /*
    3. write a program that can print out the unique elements from an int array
		   HINT: store all the unique elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}

     */
    public static void main(String[] args) {

         int[] arr ={1,1,2,3,3,4,5};
         ArrayList<Integer> uniques = new ArrayList<>();

            for(int i=0; i<arr.length; i++){
                 int count =0;

            for(int j=0; j<arr.length; j++){
                if(arr[j]==arr[i]){
                    count++;
                } }
            if(count==1){
                uniques.add(arr[i]);
            } }
                System.out.println(uniques);



    }
}

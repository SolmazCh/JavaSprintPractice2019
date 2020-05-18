package Practice_HardTasks;

/*
2. write a program that sort the array in descending order
reverse the array that is sorted to ascending order
 */

import java.util.Arrays;

public class descending {

    public static void main(String[] args) {

        double[] arr ={4,3,7,2,2.5,5.5,1};
        double[] reverse =new double[arr.length];

        Arrays.sort(arr);

        int k=0;
        for(int i=arr.length-1; i>=0; i--){
            reverse[k]=arr[i];
            k++;
        }

        System.out.println(Arrays.toString(reverse));



    }
}

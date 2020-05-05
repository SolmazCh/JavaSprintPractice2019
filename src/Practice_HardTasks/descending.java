package Practice_HardTasks;

import java.util.Arrays;
/*
2. write a program that sort the array in descending order
reverse the array that is sorted to ascending order
 */

public class descending {

    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 8, 3, 9, 5, 0, 2};

        Arrays.sort(arr);

        int arr2[] =new int[arr.length];

        int k=0;
        for(int i=arr.length-1; i>=0; i--){
            arr2[k]=arr[i];
            k++;
        }

        System.out.println(Arrays.toString(arr2));

    }
}

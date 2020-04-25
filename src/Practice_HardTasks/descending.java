package Practice_HardTasks;

import java.util.Arrays;
/*
2. write a program that sort the array in descending order
reverse the array that is sorted to ascending order
 */

public class descending {

    public static void main(String[] args) {

        int[] arr ={4,6,8,3,9,6,3,2,0};

        int[] result =new int[arr.length];
        Arrays.sort(arr);

        int k=0;
        for(int i=arr.length-1; i>=0; i--){
            result[k]+=arr[i];
            k++;
        }

        System.out.println(Arrays.toString(result));

    }
}

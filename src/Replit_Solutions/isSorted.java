package Replit_Solutions;

import java.util.Arrays;

public class isSorted {
    public static void main(String[] args) {

        int[] nums ={2,3,4,5};

        int[] arr = new int[nums.length];

        for(int i=0; i<arr.length; i++){
            arr[i]=nums[i];
        }

        Arrays.sort(nums);

        if(Arrays.equals(arr,nums)){
            System.out.println(true);
        }
        System.out.println(false);







    }
}

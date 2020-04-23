package Replit_Solutions;

import java.util.Scanner;

public class nonDublicat {
    /*
    Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        int count=0;

        int nonDub=0;

        for(int i=0; i<nums.length; i++){

            for(int each : nums){

                if(each !=nums[i]){
                    nonDub+=each;
                    count++;
                }

                if(count==1){
                    System.out.println(nonDub);
                }
            }

        }


    }
}

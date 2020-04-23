package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;
/*
1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
*/

public class AverageNum_Array {

    public static void main(String[] args) {

        DecimalFormat DF = new DecimalFormat("0.00");
        double[] nums = {4,5,6,7,8,10,20,30,1};

        double sum=0;
        double average=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];

        }

        average = sum/nums.length;

        System.out.println(average);
        System.out.println(DF.format(average));



    }
}

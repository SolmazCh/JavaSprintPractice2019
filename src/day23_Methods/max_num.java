package day23_Methods;

import java.util.Arrays;

public class max_num {

    public static void main(String[] args) {

        double[] nums = {1,2,3,34,6,7,8,9,3,2,20,15};

        maxNum(nums);

        Maxnum();

    }


    public static void maxNum(double[] array){


        Arrays.sort(array);

        int lasIndex = array.length-1;

        double maxNum = array[lasIndex];

        System.out.println(maxNum);










    }



    public static void Maxnum(){
        int[] nums = {2,5,7,9,9,99,78,56,34};

        int Maxnum = nums[0];

        for(int eachnum : nums) {
            if (eachnum > Maxnum) {
                Maxnum = eachnum;
            }
        }
            System.out.println(Maxnum);

    }






}

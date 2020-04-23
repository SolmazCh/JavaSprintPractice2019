package Replit_Solutions;

public class printunique151 {

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int each : nums) {
                if (each == nums[i]) {
                    count++;
                }
            }


                if (count == 1) {
                    System.out.println(nums[i]);
                }
        }








    }
}
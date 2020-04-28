package day30_ArrayList;

import java.util.ArrayList;

public class uniqueFromList {
    /*
    4.	write a program that can find the unique elements from
    an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
     */

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> uniques = new ArrayList<>();

        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for(int each: nums){
            int count =0;
            for(int i=0; i<nums.size(); i++) {
                if (each == nums.get(i)){
                    count++;
                }
            }
            if(count==1){
                uniques.add(each);
            }
        }
        System.out.println(uniques);
    }
}

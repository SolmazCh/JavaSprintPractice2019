package day30_ArrayList;

import java.util.ArrayList;

public class Reversed_Integer {
    /*
    2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1

     */
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> reverse = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for(int i=nums.size()-1; i>=0; i--){
            System.out.print(nums.get(i)+" ");
        }


        System.out.println();
        for(int i=nums.size()-1; i>=0; i--){
            reverse.add(nums.get(i));
        }

        System.out.println(reverse);

    }
}

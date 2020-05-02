package Replit_Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class timesTwo {

    public static void timesTwo(ArrayList<Integer> nums){

        int result=0;
        for(int each:nums){
            result+=each*2;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
       nums.add(3);
       nums.add(5);
       nums.add(2);
       nums.add(7);

        ArrayList<Integer> timestwo = new ArrayList<>();
           for (int each : nums) {
              timestwo.add(each*2);
           }

        System.out.println(timestwo);

        System.out.println("===============================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,8,1,3));

       //Integer a=1;
      // list.removeAll(Arrays.asList(3,1,5,8)); first way
        Integer[] arr ={1,3,5,8};
        list.removeAll(Arrays.asList(arr)); // second way
        System.out.println(list);

        String[] names= {"Ahmad", "John","Daniel", "Ahmad"};

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(names));

        list2.removeAll(Arrays.asList("Ahmad"));


        System.out.println(list2);



       }


    }



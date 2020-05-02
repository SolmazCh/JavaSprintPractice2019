package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
     /*
    3. write a program that can print out the unique elements from an int array
		   HINT: store all the unique elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}

     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);


        ArrayList<Integer> uniques = new ArrayList<>();

        for(Integer each2: list){
            int count =0;
            for(Integer each :list){
                if(each==each2){
                    count++;
                }
            }
            if(count==1){
                uniques.add(each2);
            }
        }

        System.out.println(uniques);






    }
}

package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] nums ={1,2,3,4};

        for(int eachElement: nums){
            System.out.println(eachElement);

        }


        String[]  students ={"Muxtar", "Asiya", "Murodil"};

        for(String str: students){
            System.out.println(str);
        }


        int[]  arr1 ={1,2,3,4,5,6,7,8,9,10};


            for(int eachnum :arr1){

                if(eachnum<5){
                    continue;
                }

                System.out.println(eachnum);
            }

        System.out.println("=======================================");

           String sentence = "I like Java"; // Java like I

       String[] words = sentence.split(" "); // [I, like, Java]

        for(String eachWord : words){
            System.out.println(eachWord);

        }

        System.out.println("================================================");

            for(int i=words.length-1; i>=0; i--){
                System.out.println(words[i]);
            }






    }
}


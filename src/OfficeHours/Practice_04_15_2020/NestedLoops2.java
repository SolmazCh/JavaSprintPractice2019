package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops2 {

    public static void main(String[] args) {

       int[][] numbers = {
               {5,4,3,2,1},
               {10,11,12,13,14,15},
               {16,17,18,19,20},
       } ;

        //print all the odd numbers with regular for loop


        for(int j=0; j<numbers.length; j++){

            for(int i=0; i<numbers[j].length; i++){

                if(numbers[j][i]%2==0){
                    continue;
                }
                System.out.print(numbers[j][i]+" ");
            }
        }


        System.out.println();




        // print all the even numbers with for each loop


        for(int[] each1D : numbers){

            for(int  eachelement : each1D){

                if(eachelement%2!=0){
                    continue;
                }
                System.out.print(eachelement+" ");
            }


        }






    }
}

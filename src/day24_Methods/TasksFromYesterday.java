package day24_Methods;

import java.util.Arrays;


public class TasksFromYesterday {
    /*
    1. write a methods that can return the maximum number between two numbers
    Ex: Max(10, 20) ==> 20
            2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
    Ex: calculate(10, 2, '*') ==> 20;
    calculate(10, 2, '&') ==> Invalid operator
    NOTE: The method MUST take three arguments when it's called
            3. write a method that can identify if a string is palindrome
    ex: palindrom("level")  ==> true
    palindrome("Cybertek") ==> false
            :+1:
            3
            :ok_hand::skin-tone-2:
            1
*/




    public static void MaxNumber(int[] array){

        Arrays.sort(array); // ascending order
        System.out.println("Maximum number is: "+array[array.length-1]);
    }


    public static void MinNumber(int[] array){

        Arrays.sort(array); //ascending order
        System.out.println("Minimum number is: "+array[0]);
    }


    public static  void Descending(int[] array){
        Arrays.sort(array);


        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");

        }

        System.out.println();
    }






    public static void main(String[] args) {
        int[] arr ={10,8,9,5,4,3,2,1};
        MaxNumber(arr);

        MinNumber(arr);

        int[] arr2 ={100,20,30,40,40,-100};

        MaxNumber(arr2);
        MinNumber(arr2);
        Descending(arr2);
    }






}

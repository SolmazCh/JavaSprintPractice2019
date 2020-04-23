package day22_Arrays_Loops;

import java.util.Arrays;
/*
write a program that can reverse the array
 */

public class reverse_Array {

    public static void main(String[] args) {

        String sentence = "I love learning Java";

        String[] words = sentence.split(" ");

        String result ="";

        for(int i=words.length-1; i>=0; i--){
            result+=words[i]+" ";
        }

        System.out.println(result);


        System.out.println("===================================================");


        int[] arr ={1,2,3,4,5};

        int reverse =0;

        for(int i =arr.length-1; i>=0; i--){
            reverse=arr[i];
            System.out.println(reverse);

        }

        System.out.println("========================================");


        int[] Revarr = new int[arr.length]; // [0,0,0,0,0]
/*
        Revarr[0]  = arr[4];
        Revarr[1]  = arr[3];
        Revarr[2]  = arr[2];
        Revarr[3]  = arr[1];
        Revarr[4]  = arr[0];
*/
        System.out.println(Arrays.toString(Revarr));


        int j = arr.length-1;

        for(int i =0; i>arr.length; i++){
            Revarr[i] = arr[j];
            j--;
        }

        System.out.println(Arrays.toString(Revarr));



    }
}
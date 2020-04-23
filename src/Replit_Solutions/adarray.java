package Replit_Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class adarray {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

         add_to_r(arr,n);


    }

    public static void add_to_r(int[] r, int n){

        int[] newarr = new int[r.length+1];

        for(int i=0; i<r.length; i++){
            newarr[i]=r[i];
        }

        newarr[newarr.length-1] = n;


        System.out.println(Arrays.toString(newarr));
    }
}

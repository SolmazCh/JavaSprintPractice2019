package Replit_Solutions;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        String arr[] ={"apple", "pear"};

        String arr2[] = new String[arr.length];

        int k=0;
        for(int i=arr2.length-1; i>=0; i--){
            arr2[k]=arr[i];
            k++;
        }

        System.out.println(Arrays.toString(arr2));








    }
}

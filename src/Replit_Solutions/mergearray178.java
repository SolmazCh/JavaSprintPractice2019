package Replit_Solutions;

import java.util.Arrays;

public class mergearray178 {
    public static int[] mergR(int[] a, int[] b) {

        int[] arr = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            arr[a.length + i] = b[i];
        }
        return arr;
    }//end mergR

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] arr = mergR(a,b);

        System.out.println(Arrays.toString(arr));

    }




}
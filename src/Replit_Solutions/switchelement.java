package Replit_Solutions;

import java.util.Arrays;

public class switchelement {

    public static int[] do_switch(int[] i) {
        int[] arr = new int[i.length];

        for(int k=0; k<arr.length; k++){
            arr[k]+=i[k];
        }
        arr[0] = i[i.length-1];
        arr[arr.length-1] = i[0];
        return arr;
    }

    public static void main(String[] args) {
        int[] i ={1,4,7,4,6,8,3,5};

        int[] arr2 = do_switch(i);

        System.out.println(Arrays.toString(arr2));


    }
}

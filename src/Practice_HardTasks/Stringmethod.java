package Practice_HardTasks;

import java.util.Arrays;

public class Stringmethod {

    public static void main(String[] args) {
         /*
        reverse sentence day great is today
         */
         String str = "Today is a great day";

         String[] arr =str.split(" ");

         String[] reverse =new String[arr.length];

         int k=0;
         for(int i=arr.length-1; i>=0; i--){
            reverse[k]=arr[i];
             k++;
         }

        System.out.println(Arrays.toString(reverse));



    }
}

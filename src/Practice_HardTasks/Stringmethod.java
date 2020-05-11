package Practice_HardTasks;

import java.util.Arrays;

public class Stringmethod {

    public static void main(String[] args) {
         /*
        reverse sentence day great is today
         */
         String str = "Today is a great day";

         String[] arr = str.split(" ");
         String reverse ="";
         for(int i=arr.length-1; i>=0; i--){
             reverse+=arr[i]+" ";
         }
        System.out.println(reverse);



    }
}

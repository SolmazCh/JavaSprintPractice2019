package Practice_HardTasks;

import java.util.Arrays;

public class Stringmethod {

    public static void main(String[] args) {
         /*
        reverse sentence day great is today
         */


         String str = "Today is a great day";
         String result ="";

        String[] arr = str.split(" ");

        for(int i=arr.length-1; i>=0; i--){
            result+=arr[i]+" ";
        }


        System.out.println(result);




    }
}

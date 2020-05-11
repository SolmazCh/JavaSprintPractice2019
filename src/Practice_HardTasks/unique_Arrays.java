package Practice_HardTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class unique_Arrays {
     /*
    write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
     */


    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3};

        for(int i=0; i<arr.length; i++){
            int count=0;

            for(int k=0; k<arr.length; k++){
                if(arr[i]==arr[k]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }






    }

}

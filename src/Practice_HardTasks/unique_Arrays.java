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

        int[] arr = {1,1,2,3,3,7,8};


        for(int each1:arr){
            int count=0;

            for(int each2:arr){
                if (each1==each2){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each1);
            }
        }









    }
}

package Practice_HardTasks;
 /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxNum_class32 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8));

        Collections.sort(list);

        System.out.println(list);

        int max= Collections.max(list);

        list.removeAll(Arrays.asList(max));
        System.out.println(list);
        int secondMax=Collections.max(list);

        System.out.println(secondMax);


    }
}

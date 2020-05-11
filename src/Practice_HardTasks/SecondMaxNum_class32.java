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
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8)); //7
        System.out.println(list);

        int max = Collections.max(list);

        list.removeAll(Arrays.asList(max));

        int secondMax = Collections.max(list);
        System.out.println(secondMax);

        System.out.println("===================================================");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,1,2,3,1,4,5,6,7,8,8)); //2

        int min = Collections.min(list2);
        list2.removeAll(Arrays.asList(min));

        int secondMin=Collections.min(list2);
        System.out.println(secondMin);

    }
}

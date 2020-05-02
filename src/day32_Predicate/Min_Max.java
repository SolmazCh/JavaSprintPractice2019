package day32_Predicate;

import com.sun.istack.internal.ByteArrayDataSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Min_Max {
    public static void main(String[] args) {

            /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,5,6,4,7,8,8));

        int secondMin=0;
        int secondMax=0;
        System.out.println(list);

        Integer maxNum=Collections.max(list);

        list.removeAll(Arrays.asList(maxNum));

        secondMax = Collections.max(list);
        System.out.println(secondMax);

        Integer minNum =Collections.min(list);

        list.removeAll(Arrays.asList(minNum));

        secondMin = Collections.min(list);

        System.out.println(secondMin);


    /*  Collections.sort(list);
      Collections.min(list);
      Collections.max(list);
      Collections.swap(list,1,2);
      Collections. frequency();                             repeat all this, these all for ArrayList

*/

        System.out.println("===================================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5));  // {1,2,3,4,5}
                                                 //  0       4


        System.out.println(list3);
        Collections.swap(list3,0,4); //{5,2,3,4,1}
        System.out.println(list3);

        System.out.println("==============================================");

        ArrayList<String > names = new ArrayList<>(Arrays.asList("Omer","Omer","Mary","Sha","Omer"));

     /*   names.set(0,"Irina");
        names.set(1,"Irina");
        names.set(5,"Irina");
*/
     Collections.replaceAll(names,"Omer", "Irina");
        System.out.println(names);

    }
}

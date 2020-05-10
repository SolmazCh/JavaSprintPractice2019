package Practice_HardTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class movezeros {
    /*
      Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declare any extra lists

 */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

       for(int i=0; i<list.size(); i++){
           if(list.get(i)==0){
               list.remove(i);
               list.add(0);
           }
       }
       System.out.println(list);


        System.out.println("=============================================================");

        int count = Collections.frequency(list,0);

        list.removeAll(Arrays.asList(0));

        for(int i=0; i<count; i++){
            list.add(0);
        }

        System.out.println(list);
    }

}

package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);

        int maximum = Integer.MIN_VALUE;

        // int max = list.get(0);  // this way is also possible
        for (int i = 0; i < list.size(); i++) {
            if (maximum < list.get(i)) {
                maximum = list.get(i);
            }
        }
        System.out.println(maximum);


        int maximum2 = Integer.MIN_VALUE;

        for (int each : list) {
            if (each > maximum2) {
                maximum2 = each;
            }
        }
        System.out.println(maximum2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

      int maximum3=  max(list);
        System.out.println(maximum3);

    }

      public static int max(ArrayList<Integer> list) {
          int maximum = Integer.MIN_VALUE;

          for (int i = 0; i < list.size(); i++) {
              if (maximum < list.get(i)) {
                  maximum = list.get(i);
              }
          }
          return maximum;
      }





}

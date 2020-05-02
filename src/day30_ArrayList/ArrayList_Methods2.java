package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {


        ArrayList<String> list =new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

         // list.remove(1); // remove "B" ==> {A,C}

        String s1="B";

        boolean r1 = list.remove(s1);
        list.remove("B");

        boolean r2 =list.remove("A");  //true;

        System.out.println(list);


        list.clear();  // it clears everything in list

        System.out.println(list);

        System.out.println(list.size());


        list.add("D");
        list.add("G");

        System.out.println(list.indexOf("G"));

    ArrayList<Integer> list2 = new ArrayList<>();

      list2.add(1);
      list2.add(2);
      list2.add(3);

      Integer a = list2.indexOf(3);  // 2
        System.out.println(a);


        int num1 =list2.indexOf(3);
        System.out.println(num1);



    }
}

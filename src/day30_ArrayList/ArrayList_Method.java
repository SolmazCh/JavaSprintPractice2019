package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5); //0
        list.add(7); //2
        list.add(8); //3
        list.add(1,6); //1

        //  list.add(7,10);  index out of bound

        System.out.println(list);

        list.set(3,9); // for replacing the index with another element

        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A"); // {A}
        list2.add("B"); // {A,B}

        list2.add(1,"C");//  {A,C,B}
        list2.add(1,"D"); // {A,D,C,B}

        list2.set(3,"F");  // {A,D,C,F}
        list2.set(2,"E"); // {A,D,E,F}

        System.out.println(list2);


        System.out.println("========================================================");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(1); //0
        list3.add(2); //1
        list3.add(3);//2
        list3.add(4);//3
        // {1,2,3,4}

        // list3.remove(1); // {1,3,4}

        Integer a=1;

        list3.remove(a); //{2,3,4}
        System.out.println(list3);

        list3.remove(2); // {2,3}

        System.out.println(list3);

        ArrayList<Integer> list4 =new ArrayList<>();

        list4.add(10);
        list4.add(20);
        list4.add(30);
        //{10,20,30}

        list4.remove(1); // first way to remove with index number

        Integer s =20;  // second wat to remove with object itself
        boolean r1 = list4.remove(s);

        list4.remove(s);

        System.out.println(list4);
        System.out.println(r1);









    }
}

package day24_Methods;

import Resources.Library;

import java.util.Arrays;


public class Test {

    public static void main(String[] args) {
       String str = "Solmaz";

     String rev =  Library.Reverse2(str);

        System.out.println(rev);


        int[] arr = {9,47,67,35,23};

      arr =  Library.sortDescending(arr);

        System.out.println(Arrays.toString(arr));



        String s = "AABCC";

       s= Library.RemoveDuplicates(s);

        System.out.println(s);

        String st = Library.frequency(s);

        System.out.println(st);



        int[] a = {3,4,7,9,0,3,1};

        int k= Library.maxNum(a);

        System.out.println(k);

        String kj = Library.minNUm(a);

        System.out.println(kj);

    }






}

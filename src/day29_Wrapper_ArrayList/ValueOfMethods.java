package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {

    public static void main(String[] args) {

        String str ="123";

        Integer a = Integer.valueOf(str);  // Integer, 123

        System.out.println(a);

        double b = Integer.valueOf(str);

        System.out.println(b);

        String str2 ="15.5";

       double d1 = Double.parseDouble(str2);
       // double = double // none

        double d2 =Double.valueOf(str2);

       //  double = Double // unboxing

        System.out.println(d1);  // 15.5
        System.out.println(d2); // 15.5

        System.out.println(d1==d2);

        System.out.println("==================================================================");


       int z1 =2000;

      // Long L1 = z1; // does not accept any other primitives except for long

        Short sh1 =3000;

        int z2 =sh1;


        /*
        "true" boolean
        "fAlSe' boolean
        "100000000000.5" float
        "123456" short
         */

        String c1 ="true";

      boolean b1 =  Boolean.parseBoolean(c1);
        System.out.println(b1);

        String c2 ="fAlSe";

        boolean b2 = Boolean.parseBoolean(c2);
        System.out.println(b2);

        String c3 = "100000000000.5";

        double ff = Double.parseDouble(c3);

        System.out.println(ff);

        String c4 ="123456";

        int c5 = Integer.parseInt(c4);
        System.out.println(c5);


        String r1 = "true";

        Boolean t1 = Boolean.valueOf(r1); // Boolean true

        boolean t2 = Boolean.valueOf(r1); // Boolean, true
        // boolean= Boolean // unboxing

        System.out.println(t1);
        System.out.println(t2);


        //valueOf method returns Wrapper class
        //parse method returns primitive values

        System.out.println("====================================================");

        int maxNum = Integer.MAX_VALUE;

        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;

        double minnUm = Double.MIN_VALUE;

        System.out.println(maxNum2);

        System.out.println(minnUm);

        int minNum2 = Integer.MIN_VALUE;
        System.out.println(minNum2);

        byte Maxnum = Byte.MAX_VALUE;
        System.out.println(Maxnum);


        int[] arr =new int[3];

        System.out.println(Arrays.toString(arr)); // [0,0,0]

        boolean[] arr2 = new boolean[3]; // [false,false,false]

        System.out.println(Arrays.toString(arr2));

        Integer[] arr3 = new Integer[3];

        System.out.println(Arrays.toString(arr3)); // [null,null,null] wrapper class return null




    }
}

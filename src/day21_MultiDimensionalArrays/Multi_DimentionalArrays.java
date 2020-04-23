package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimentionalArrays {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int[][] arr2D ={ {1, 2, 3}, {4,5,6,7},  };
                      //   0      ,    1

        System.out.println(arr2D.length);


        int[] arr1D = arr2D[0];    //{1,2,3}

        System.out.println(Arrays.toString(arr1D));


        int num1 =  arr2D[1] [3]; // 1ci arrayi secir, 2ci arrayin ozunun icindekilerin indexidi

        System.out.println(num1); //7

        // { 'A', 'B' };


                           // 0,    1      0,  1,  2     0    1   2
        char [] [] ch2D = { {'A', 'B'}, {'C','D','E'}, {'G','H','I'} };
          //index:               0            1               2

      char ch1 =  ch2D[1]  [2]; // 'E'

        System.out.println(ch1);


      char[] ch2 =  ch2D[2];

        System.out.println(Arrays.toString(ch2) );

        //index:              0,  1,   2     0    1   2      0    1    2
        String[][] str2D ={ {"A","B","C"}, {"D","E","F"}, {"J", "H", "I"}};
        //index:                  0               1               2

        String str1 = str2D[1] [2];

        System.out.println(str1);






    }
}

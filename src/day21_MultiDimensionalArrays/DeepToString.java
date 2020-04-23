package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class DeepToString {

    public static void main(String[] args) {

        int[] arr1D = {1,2,3};

        System.out.println(Arrays.toString(arr1D));

        int[] [] arr2D  = { {1,2,3}, {4,5,6}  };

        System.out.println(Arrays.deepToString(arr2D));

         //                      0         1
        int[][][] arr3D = {  { {1,2,3}, {4,5,6}  } ,     { {1,2,3}, {4,5,6}  },      };
            //  index                   0                           1

      int[][] i =  arr3D[1]; //[[[1, 2, 3], [4, 5, 6]], [[1, 2, 3], [4, 5, 6]]]

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println("******************************");

        int i2 = arr3D[0] [0] [1]; //2

        System.out.println(i2);

        System.out.println("*******************************");

        int[] i3 =arr3D[1] [1]; // [4, 5, 6]

        System.out.println(Arrays.toString(i3));



    }
}

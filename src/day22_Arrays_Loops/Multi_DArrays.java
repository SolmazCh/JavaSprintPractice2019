package day22_Arrays_Loops;

import java.util.Arrays;

public class Multi_DArrays {

    public static void main(String[] args) {

        int[] arr ={1,2,3};
        //          0,1,2



        //2D array:
        int[][] arr2D ={  {1,2,3}, {4,5,6}  };
             //              0        1

       int[] arr1D = arr2D[0];  // {1,2,3}

        System.out.println(Arrays.toString(arr1D)); //[1, 2, 3]
        System.out.println(Arrays.toString(arr2D[0]));//[1, 2, 3]
        System.out.println(arr2D[0][1]); //2
        System.out.println(Arrays.deepToString(arr2D)); //[[1, 2, 3], [4, 5, 6]]
        System.out.println(Arrays.toString( arr2D[1])); //[4, 5, 6]

        System.out.println("*******************************");

        for(int eachelement : arr2D[0]){
            System.out.println(eachelement);
        }

        for(int[] each :arr2D){
            System.out.println(Arrays.toString(each));
        }

        for(int i =0; i<arr2D[0].length; i++){
            int num = arr2D[0][i];
            System.out.println(num);
        }

    }
}

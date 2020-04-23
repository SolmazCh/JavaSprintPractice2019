package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {


        int a =100;
        int[] arr ={100,200,300};

        System.out.println(arr[1]);


        for(int i=0; i<3; i++){
            int num =arr[i];
            System.out.println(num);
        }


        System.out.println("=================================");

        int j =0;

        while(j<3){
            int num =arr[j];
            System.out.println(num);
            j++;
        }


        System.out.println("===================================");

             String[] names = {"John", "Aaron", "Luoise"};

             String[] namesRev =new String[names.length];

/*
             int k=names.length-1;

             for(int i=0; i<names.length; i++){
                 namesRev[i] = names[k];
                 k--;
             }

*/

       int i=0;
       int k =names.length-1;

       while (i<names.length){

           namesRev[i] = names[k];

           i++;
           k--;
       }






        System.out.println(Arrays.toString(namesRev));










    }
}

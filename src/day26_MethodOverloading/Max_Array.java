package day26_MethodOverloading;

import java.util.Arrays;

public class Max_Array {

    public static int maxnum(int[] arr){
        Arrays.sort(arr);

        int max = arr[arr.length-1];

        return max;
    }

    public static double maxnum(double[] arr){
        Arrays.sort(arr);

        double max = arr[arr.length-1];

        return max;
    }

    public static int minnum(int[] arr){
        Arrays.sort(arr);

        int min = arr[0];

        return min;
    }

    public static double minnum(double[] arr){
        Arrays.sort(arr);

        double min = arr[0];

        return min;
    }

    public static int[] descending(int[] arr){
        Arrays.sort(arr);

        int[] descending =new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
          descending[j]=arr[i];
          j++;
         }
         return descending;
         }

    public static double[] descending(double[] arr){

        Arrays.sort(arr);

        double[] descending = new double[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            descending[j] =arr[i];
            j++;
        }
        return descending;
    }

    public static char[]  descending(char[] arr){
        Arrays.sort(arr);

        char[] descending = new char[arr.length];

       int j=0;

       for(int i=arr.length-1; i>=0; i--){
           descending[j] =arr[i];
           j++;
       }
       return descending;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 4, 5, 6, 7, 8, 6, 2,};

        int max = maxnum(arr);

        int min = minnum(arr);


        System.out.println(max);
        System.out.println(min);

        double[] arr2 = {10.0, 2.5, 3.0, 4.9, 5, 7, 3};

        double min2 = minnum(arr2);

        double max2 = maxnum(arr2);

        System.out.println(min2);
        System.out.println(max2);

        double[] arr2des = descending(arr2);

        System.out.println(Arrays.toString(arr2des));

        int[] arr3 = {1, 2, 3, 4, 5, 6, 9};

        int[] arr3des =descending(arr3);

        System.out.println(Arrays.toString(arr3des));


        char[] ch = {'a', 'j', 'k', 'f', 'd'};

        char[] chdes =descending(ch);

        System.out.println(Arrays.toString(chdes));
    }







}

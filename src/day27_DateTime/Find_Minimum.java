package day27_DateTime;
/*
 1. write a return method that can return the minimum number from an int array
        2. write a return method that can return the minimum number from a double array
                    NOTE: apply method overloading,  DO NOT USE SORT METHOD.

 */
public class Find_Minimum {

    public static void main(String[] args) {
        int[] arr ={5,4,7,5}; //4
       int minimum =minimum(arr);
        System.out.println(minimum);
    }

    public static int minimum(int[] arr){
        int minimum = arr[0];
        for( int each:arr){
            if(each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }

    public static double minimum(double[] arr){
        double minimum = arr[0];
        for( double each:arr){
            if(each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }

}

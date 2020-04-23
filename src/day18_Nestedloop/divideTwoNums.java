package day18_Nestedloop;

public class divideTwoNums {

    public static void main(String[] args) {
        /*1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

        10/3 ==> 3 with a remainder of 1

        a= a-b =7;
        a= a-b =4;
        a= a-b =1;

        COUNT = 3; a=1;

         */

        int a =20;
        int b =1;

        if(b==0){
            System.out.println("divisor can not be zero");
            System.exit(0);
        }

      int count = 0; // count the execution of the loop

      while( a >= b){
          a-=b;
          count++;
        }

      if(a==0) {
          System.out.println("The result is: " + count);
      }else {
          System.out.println("The result is: " + count+" with a remainder of "+a);
      }




        System.out.println("================================================================================");


         int num1 = 10;
         int num2 = 3;

         int result = 0;

         if(num2==0){
             System.out.println("Division can not be zero");
             System.exit(0);
         }


         while(num1>=num2){

           num1-=num2;

           result++;
         }


         if(num1==0) {


             System.out.println("Result is: "+result);

         }else{
             System.out.println("Result is: "+result+" with a remainder: "+num1);
         }









    }



}

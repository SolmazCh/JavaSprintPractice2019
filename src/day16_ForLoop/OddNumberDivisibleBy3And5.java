package day16_ForLoop;

public class OddNumberDivisibleBy3And5 {

    public static void main(String[] args) {

        //1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5

         for(int a=1; a<=100;  a++ ) {  // a%2 != 0 for odd number

             if (a % 2 != 0) {          // a%2 ==0  even number

                 if(a%15==0)

                 System.out.print(a+" ");
             }

         }
    }
}

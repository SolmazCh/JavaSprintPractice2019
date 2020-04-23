package day16_ForLoop;

public class evenNumDivisibleBy3And5 {

    public static void main(String[] args) {

        //write a program that can print all the EVEN numbers between 1 ~ 100 that can be divisible by 3 & 5

        String result = "";

        for( int a =2; a<=100; a++  ) {

            if (a % 2 == 0) {

                if (a % 15 == 0) {
                    System.out.print(a+" ");
                }

            }
        }


    }
}

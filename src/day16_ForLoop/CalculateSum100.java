package day16_ForLoop;

public class CalculateSum100 {

    public static void main(String[] args) {

        //write a program that can calculate the sum of all the even numbers between 1 ~ 100


        int sum1 = 0;
        int sum2 =0;

        for(int i = 0; i<=100; i++) {

            if (i % 2 == 0) {

                sum1+=i;

            }else {  // odd number
                  sum2 += i;

            }
        }

                 System.out.println("sum of all even numbers: "+ sum1);
                 System.out.println("sum of all odd numbers: "+ sum2);

    }
}
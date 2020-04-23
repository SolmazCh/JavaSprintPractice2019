package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max =-2147483648;  // 0,

        int min =21474836;
        int i =1;

        while(i<=5) {
            System.out.println("Enter a number");

            int num = scan.nextInt(); //10, 20, 5

            if(num>max){
                max =num;
            }

            if( num<min){
                min=num;
            }
            i++;
        }

        System.out.println("Maximum number is: "+max);


        System.out.println("Minimum number is: "+min);






    }
}

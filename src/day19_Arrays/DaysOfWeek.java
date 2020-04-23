package day19_Arrays;

import java.util.Scanner;

/*
Create an array that holds the days. User should be able to enter the day index and output should be:“Today is Monday”
 */
public class DaysOfWeek {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter a number of a day");

        int num = scan.nextInt();

        System.out.println("Today is: "+days[num-1]);





    }
}

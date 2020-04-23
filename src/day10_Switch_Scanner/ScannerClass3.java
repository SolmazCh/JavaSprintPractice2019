package day10_Switch_Scanner;

import java.util.Scanner;


public class ScannerClass3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");

        int salary = input.nextInt();

        System.out.println("How many hours do you work per week?");

        byte weeklyHours = input.nextByte();

        System.out.println("How many weeks do you work in a year");

        byte numberofweeks = input.nextByte();

        int hourlyRate = salary / numberofweeks / weeklyHours  ;

        System.out.println("Your hourly rate with tax is: $"+hourlyRate);









    }
}

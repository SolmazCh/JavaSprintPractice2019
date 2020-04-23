package day19_Arrays;

import java.util.Scanner;

/*
Create an array that holds 12 months names User should be able to enter month index and output should be:“The month name is <MonthName>”
 */
public class month {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        String[] months ={"January", "February", "March", "April", "May", "June", "July", "August", "September", "November", "December"};

        System.out.println("Enter a number of month");

        int num = scan.nextInt();


        System.out.println("Month name is: "+months[num-1]);



    }

    }
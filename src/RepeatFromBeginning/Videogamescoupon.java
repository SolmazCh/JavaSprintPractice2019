package RepeatFromBeginning;

import java.util.Scanner;

public class Videogamescoupon {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter seconds");

        int inputsecond = scan.nextInt();

        int hours = inputsecond/3600; //  3600*5=18000   (20394-18000) / 60 = 39 // 39*60=2340*60=
        int minutes = inputsecond%3600;

        int seconds = inputsecond%3600 - inputsecond%3600/600;

        // seconds = inpuseconds - 3600*hours - inputseconds%3600
        System.out.println(minutes);

        // 20394- hours*3600 - minutes*60

    }
/*

- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
     */





}

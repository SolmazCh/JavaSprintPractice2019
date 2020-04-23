package RepeatFromBeginning;

import java.util.Scanner;

public class rateCalculaterScanner {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your salary:");

        int salary = scan.nextInt();

        System.out.println("How many hours do you work per week?");

        byte hoursperweek = scan.nextByte();

        int rate = salary / hoursperweek / 52 ;

        System.out.println("Your hourly rate is: "+rate);







    }
}

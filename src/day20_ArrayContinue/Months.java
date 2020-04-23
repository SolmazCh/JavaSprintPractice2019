package day20_ArrayContinue;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = scan.nextInt();

        int attend =1;

        while (num<=0 || num>12){
            System.out.println("Invalid entry");
            System.out.println("Please re-enter the number");
            num = scan.nextInt();
            attend++;

            if(attend ==3 && (num<=0 || num>12) ){
                System.out.println("Invalid entry, you already have only 3 attends");
                System.exit(0);
            }
        }

        String result ="";

        result =months[num-1];

        System.out.println("Month name is: "+result);

    }
}

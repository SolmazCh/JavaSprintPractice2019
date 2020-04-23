package day20_ArrayContinue;

import java.util.Scanner;

public class days {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        System.out.println("Enter a number");

        int num = scan.nextInt();

        int attends =0;

        while(num<=0 || num>7){
            System.out.println("Sorry invalid entry, please re-enter the number");
            num = scan.nextInt();

           attends++;

           if(attends==2){
               System.out.println("Invalid entry, you already have only 3 attends");
               System.exit(0);
           }

        }

        String result =days[num-1];


        System.out.println("Day of week is: "+result);





    }
}

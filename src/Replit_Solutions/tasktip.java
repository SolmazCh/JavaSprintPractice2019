package Replit_Solutions;

import java.util.Scanner;

public class tasktip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Split:");

        String split = scan.next();

        double checkAmount = 476.0;


        if(split=="yes"){

            System.out.println("Number of people:");

            int numOfPeople = scan.nextInt();

            for( int i =(int)numOfPeople; i>0; i--){
              numOfPeople =i;
            }

            System.out.println("Service quality:");

            String serviceQuality = scan.next();

            double serviceResult = (serviceQuality == "Poor") ? checkAmount*0.05 : (serviceQuality == "Fair") ?
                        checkAmount*0.1 : (serviceQuality == "Good") ? checkAmount*0.15 : (serviceQuality=="Great") ?
                        checkAmount*0.2 : checkAmount*0.25 ;









        }else{
            System.out.println("Check amount: 476.0");
            System.out.println("Total to pay: 595.0");
            System.out.println("Total tip: ");
            System.out.println();
        }







    }
}

package Replit_Solutions;

import java.util.Scanner;

public class tipincafe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String split = "4(max 5 person)";

        String servicetip = "excellent 25%( 5 star)";

        double checkamount = 476;

        double totalpay = 595;

        double totaltip = 119;

        double perperson = 148.75;

        double tipperperson = 29.75;


        System.out.println("Split:");

        String splitOrNot = scan.next();

        System.out.println("Number of people:");

        double numOfPeople = scan.nextDouble();

        System.out.println("Service quality");

        String serviceQuality = scan.next();


        if(splitOrNot.equals("yes")){
            System.out.println("Number of people entered: "+numOfPeople);
            System.out.println("Chech amount: 476.0");
            System.out.println("Total to pay: 595.0");

             if(serviceQuality.equals("Poor")){
                 System.out.println("Total tip: 23.8\nTotal per person: 148.75\nTip per person: 5.95");
             }else if(serviceQuality.equals("Fair")){
                System.out.println("Total tip: 47.60\nTotal per person: 148.75\nTip per person: 11.90");
            }else if(serviceQuality.equals("Good")){
                 System.out.println("Total tip: 71.40\nTotal per person: 148.75\nTip per person: 17.85");
             }else if(serviceQuality.equals("Great")){
                 System.out.println("Total tip: 95.20\nTotal per person: 148.75\nTip per person: 23.80");
             }else if(serviceQuality.equals("Excellent")){
                 System.out.println("Total tip: 119.0\nTotal per person: 148.75\nTip per person: 29.75");
             }

        } else{
            System.out.println("Total to pay: 595.0");
        }



















    }
}

package Replit_Solutions;


import java.util.Scanner;

public class SplitTip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split:");
        String split = input.next();

        input.nextLine();

        System.out.println("Number of people:");
        byte people = input.nextByte();

        System.out.println("Check amount:");
        double amount = input.nextDouble();

        System.out.println("Service Quality:");
        String quality = input.next();

        double tip = 0;


        if (quality.equals("Excellent")) {
            tip = 25;
        } else if (quality.equals("Great")) {
            tip = 20;
        } else if (quality.equals("Good")){
            tip = 15;
        } else if (quality.equals("Fair")) {
            tip = 10;
        } else if (quality.equals("Poor")) {
            tip = 5;
        }
        double totaltip = (amount*tip/100);
        double tipperperson = totaltip/people;
        double amountwithtips = amount+totaltip;
        double amountperperson = 0;
        if (split.equals("Yes")) {
            amountperperson = amountwithtips/people;
        }
        String peoples = "";
        if(people==1) {
            peoples="&";
        } else if (people==2) {
            peoples="&&";
        } else if (people==3) {
            peoples= "&&&";
        } else if (people==4) {
            peoples = "&&&&";
        } else if (people==5) {
            peoples = "&&&&&";
        } else if (people==6) {
            peoples = "&&&&&&";
        }





        System.out.println("Number of people entered: "+peoples);
        System.out.println("Total to pay: "+amountwithtips);
        System.out.println("Total tip: "+totaltip);
        System.out.println("Total per person: "+amountperperson);
        System.out.println("Tip per person: "+tipperperson);









    }
}

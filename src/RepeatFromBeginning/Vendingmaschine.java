package RepeatFromBeginning;

import java.util.Scanner;

public class Vendingmaschine {

    public static void main(String[] args) {

        /*
       . An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

 */


        Scanner scan= new Scanner(System.in);

        System.out.println("Enter price in cents:");

        int itemPrice = scan.nextInt();

        int quarter =(100-itemPrice)/25;
        int dimes = (100 - itemPrice)%25/10;
        int nickels =5;

        if(itemPrice<25 || itemPrice>100){
            System.out.println("Invalid price!");
        }else if(itemPrice%5 !=0){
            System.out.println("Invalid price!");
        }else {
            System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        }

















    }
}

package Replit_Solutions;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {


        /*Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase. If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
    Hint
    Use if/ else if / else
    CODE EXAMPLE:
    Example #1
    input: Hat
    output: Thank you for your purchase!
    output: Your current balance is: 75$

    Example #2
    input: Pants
    output: Thank you for your purchase!
    output: Your current balance is: 50$

    Example #3
    input: Laptop
    output: Sorry, not enough funds on your gift card!

    Example #4
    input: Cupcake
    output: Invalid item!
    List of items


    */

            Scanner scan = new Scanner(System.in);

            String item = scan.nextLine();

            String priceless100 = "Charger, USB cable, Headphones, Pants, Hat, Socks, Blanket, Pillow";

            String pricemore100 = "Smartphone, Laptop";

            String result = "";

            if (priceless100.contains(item)) {

                if (item.equals("Charger")) {
                    result = ("Thank you for your purchase!\nYour current balance is: 85$");
                } else if (item.equals("USB cable")) {
                    result = ("Thank you for your purchase!\nYour current balance is: 90$");
                } else if (item.equals("Headphones")) {
                    result = ("Thank you for your purchase!\nYour current balance is: 70$");
                } else if (item.equals("Pants")) {
                    result = ("Thank you for your purchase!\nYour current balance is: 50$");
                } else if (item.equals("Hat")) {
                    result = ("Thank you for your purchase!\nYour current balance is: 75$");
                } else if (item.equals("Socks")) {
                    result = ("Thank you for your purchase!\nYour current balance is: 95$");
                } else if (item.equals("Blanket")) {
                    result = ("Thank you for your purchase\nYour current balance is: 40$");
                } else {
                    result = ("Thank you for your purchase\nYour current balance is: 60$");
                }


            } else if (pricemore100.contains(item)) {
                result = "Sorry,not enough funds on your gift card!";

            } else {
                result = ("Invalid item!");
            }

        System.out.println(result);





        }
}

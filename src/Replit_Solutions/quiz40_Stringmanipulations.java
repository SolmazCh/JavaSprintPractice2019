package Replit_Solutions;

import java.util.Scanner;

public class quiz40_Stringmanipulations {

    /*
    Automated tests are the future.

in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
a
a is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
b
b is correct

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
c
c is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
z
z is not a valid answer
     */

    Scanner s = new Scanner(System.in);

    // System.out.println("what is the farthest planet in the solar system:" );
  //  System.out.println("a)venus" );
   // System.out.println("b)pluto" );
  //  System.out.println("c)neptune" );

   // String answer = s.nextLine();

    //your code here


    public static class gifcard {

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

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String item = scan.nextLine();

            String itemsinstoreless100 = "Charger, USB cable, Headphones, Pants, Hat, Socks, Blanket, Pillow";

            String itemsinstoremore100 = "Smartphone, Laptop";

            double Smartphone = 300;
            double Laptop = 400;
            double Charger = 15;
            double USBcable = 10;
            double Headphones = 30;
            double Pants = 50;
            double Hat = 25;
            double Socks = 5;
            double Blanket = 60;
            double Pillow = 40;


            String result = "";

            if (itemsinstoreless100.contains(item)) {
                System.out.println("Thank you for your purchase!");
                if (item.equalsIgnoreCase("Charger")) {
                    result = "Your current balance is: 85$";
                } else if (item.equalsIgnoreCase("USB cable")) {
                    result = "Your current balance is: 90$";
                } else if (item.equalsIgnoreCase("Headphones")) {
                    result = "Your current balance is: 70$";
                } else if (item.equalsIgnoreCase("Pants")) {
                    result = "Your current balance is: 50$";
                } else if (item.equalsIgnoreCase("Hat")) {
                    result = "Your current balance is: 75$";
                } else if (item.equalsIgnoreCase("Socks")) {
                    result = "Your current balance is: 95$";
                } else if (item.equalsIgnoreCase("Blanket")) {
                    result = "Your current balance is: 40$";
                } else {
                    result = "Your current balance is: 60$";
                }


            } else if (itemsinstoremore100.contains(item)) {
                System.out.println("Sorry,not enough funds on your gift card!");

            } else {
                System.out.println("Invalid item!");
            }


        }

    }
}

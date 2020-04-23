package day11_Scanner;

import java.util.Scanner;

public class Scanner_revenue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the product price: ");

        double price = scan.nextDouble();

        System.out.println("Enter the product quantity: ");

        int quantity = scan.nextInt();

        double revenue = (price * quantity);

        System.out.println("Total price is: "+revenue);

        if(revenue>5000){
            System.out.println("Congratulations! You get 10% discount!");
        }





    }
}

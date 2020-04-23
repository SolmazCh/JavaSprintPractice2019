package day23_Methods;

import java.util.Scanner;

public class GalonsToLitters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of gallons:");

        double gallon = scan.nextDouble();
             GallonsToLitters(gallon);
    }


    public static void GallonsToLitters(double gallon){



    double litter = gallon*3.75;

        System.out.println(litter);

    }










}

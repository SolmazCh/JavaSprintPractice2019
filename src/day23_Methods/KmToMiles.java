package day23_Methods;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of km:");

        double km = scan.nextDouble();

        KmToMiles(km);
    }


    public static void KmToMiles(double km){

        double miles = km*0.612;

        System.out.println(miles);
    }













}

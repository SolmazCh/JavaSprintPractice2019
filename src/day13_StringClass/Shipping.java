package day13_StringClass;

import java.util.Scanner;

public class Shipping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter building number:");

        int building = scan.nextInt();

        System.out.println("Enter Street address:");

        scan.nextLine();

        String street = scan.nextLine();

        System.out.println("Enter city name:");

        String city = scan.next();

        System.out.println("Enter state name:");

        scan.nextLine();

       String state =scan.nextLine();

        System.out.println("Enter zip code:");

        int zipcode = scan.nextInt();

        System.out.println("Enter full name:");

        scan.nextLine();

        String fullname = scan.nextLine();

        System.out.println("Ship to:    "+fullname+"\n\t\t\t"+building+" "+street+"\n\t\t\t"+city+", "+state+" "+zipcode);




    }
}

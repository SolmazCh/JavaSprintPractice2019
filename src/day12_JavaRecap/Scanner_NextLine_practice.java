package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // 7921 JonesBranch Dr, McLean VA, 22034
        // fullAddress: Building-number Street, city, state zipcode

        System.out.println("Building number: ");

        int Bnumber = scan.nextInt();
        System.out.println("Building number is: "+Bnumber);
        scan.nextLine();
        System.out.println("Street: ");

        String street = scan.nextLine();

        System.out.println("Street is: "+street);
        System.out.println("Enter the zipcode: ");

        int zipcode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter the city name and state seperated by comma and space");

        String cityandstate = scan.nextLine();

        String fulladdress = Bnumber+" "+street+", \n"+cityandstate+" "+zipcode;

        System.out.println(fulladdress);

         scan.close();  // closes the scanner, after that you cant use the scanner, you need to reopen new scanner







    }
}

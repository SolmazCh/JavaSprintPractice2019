package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


            //  String str = scan.next();

      //  System.out.println(str);

        String fullAddress = " ";

        System.out.println("Enter the number of the building: ");

         short Bnumber = scan.nextShort();

         fullAddress += Bnumber+" ";

        System.out.println("Enter the Street name: ");

        String streetname = scan.next();
        fullAddress+= streetname+" ";

        System.out.println("Enter the type of the road: ");

        String roadtype = scan.next();
        fullAddress+= roadtype+", ";

        System.out.println("Enter the city name: ");
        String cityname = scan.next();
        fullAddress+= cityname+" ";

        System.out.println("Enter the state name and zipcode: ");

        String stateName = scan.next();
        fullAddress+= stateName+", ";

        int zipcode = scan.nextInt();
        fullAddress+= zipcode;

        System.out.println("Address is: "+fullAddress);








    }
}

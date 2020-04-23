package day18_Nestedloop;

import java.util.Scanner;

public class roomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek hotel!");

        while (true) {

            System.out.println("Which room would you like to reserve?");

            String room = scan.nextLine();

            int price =0;

            while (!(room.equalsIgnoreCase("King room") || room.equalsIgnoreCase("Queen room") ||
                    room.equalsIgnoreCase("Single room") ) ) {

                System.out.println("Sorry invalid entry, please re-enter");

                room = scan.nextLine();

            }
                if (room.equalsIgnoreCase("King room")) {
                    price += 120;
                } else if (room.equalsIgnoreCase("Queen room")) {
                    price += 100;
                } else if (room.equalsIgnoreCase("Single room")) {
                    price += 80;
                }


                System.out.println("Would you like to continue?");

                String answer = scan.next();

                scan.nextLine();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("No") )){
                System.out.println("invalid entry, please re-enter");
                answer =scan.next();
            }


             if(answer.equalsIgnoreCase("no")){

                System.out.println("Your total price is: "+price);
                break;
            }



        }




    }
}

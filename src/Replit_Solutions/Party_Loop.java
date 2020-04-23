package Replit_Solutions;

import java.util.Scanner;

public class Party_Loop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // your code
        // ------------------------------------------

        String guestsList ="";

        String answer ="";

        String guestname ="";

        do {

            System.out.println("Please enter guest name:");

            guestname = input.nextLine();

            guestsList += ", "+guestname;

            System.out.println("Do you want to enter new guest name:");

            answer = input.next();

            input.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Guest's list: " + guestsList.substring(2));
            }


        } while (answer.equalsIgnoreCase("yes")) ;









    }
}

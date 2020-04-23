package day11_Scanner;

/*1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0

    output:
        full name:
        employeeed status:
        salary: */

import java.util.Scanner;

public class Scanner_Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name; ");

          String firstname = scan.next();

        System.out.println("Enter your last name: ");

        String lastname = scan.next();

        String fullName = firstname + " " + lastname ;

        System.out.println("Are you employeed? ");

        boolean employmentstatus = scan.nextBoolean();

        System.out.println("Full name is: "+fullName);

        System.out.println("Employeed: "+employmentstatus);

        double salary = 0;

        if(employmentstatus == true){
            System.out.println("Enter your salary: ");
            salary = scan.nextDouble();

        }

        System.out.println("Your salary: "+salary);





    }
}

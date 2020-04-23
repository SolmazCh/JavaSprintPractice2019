package day12_JavaRecap;

import java.util.Scanner;

public class Salary_Calculater {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");

        double salary = scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter your full name: ");

        String fullname = scan.nextLine();

        System.out.println("Enter your company name: ");

        String companyName = scan.nextLine();

        System.out.println("Enter your SSN: ");

        long SSN = scan.nextLong();

        scan.nextLine();
        System.out.println("Enter your Jobtitle: ");

        String jobTitle = scan.nextLine();

        System.out.println("Full name is: "+fullname);
        System.out.println("Job title is: "+jobTitle);
        System.out.println("Company Name: "+companyName);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary is: $"+salary);
    }
}

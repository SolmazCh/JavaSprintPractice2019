package day11_Scanner;

import java.util.Scanner;

public class salaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary:");

        int salary = input.nextInt();

        System.out.println("Enter the state tax:");

        byte statetax = input.nextByte();
        double stateTaxPercentage = statetax /100.0;
        System.out.println("Enter the federal tax:");

        byte FederalTax =input.nextByte();
        double federalTaxPercentage = FederalTax / 100.0;

             double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

              double salaryaftertax = salary - totalTax;

        System.out.println("Your salary after tax is:$"+salaryaftertax);
    }
}





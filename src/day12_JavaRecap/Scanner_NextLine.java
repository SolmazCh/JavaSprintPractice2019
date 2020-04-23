package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter some number: ");

        int num = scan.nextInt();
        int num2 =scan.nextInt();
        System.out.println(num);
        System.out.println(num2);

          scan.nextLine();
        System.out.println("Enter your name: ");

         String name = scan.nextLine();





    }
}

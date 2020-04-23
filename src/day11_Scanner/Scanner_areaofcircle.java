package day11_Scanner;

import java.util.Scanner;

public class Scanner_areaofcircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double radius = scan.nextDouble();

        double areaofcircle =(radius * radius * 3.14);

        System.out.println("Area of the circle is: "+areaofcircle);




    }
}

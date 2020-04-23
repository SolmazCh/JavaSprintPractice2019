package day23_Methods;

import day11_Scanner.Scanner_2words;

import java.util.Scanner;

public class Maxtwonums {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");

        double n1 = scan.nextDouble();

        System.out.println("Enter the second number");

        double n2 = scan.nextDouble();
        MaxNumFrom2num(n1,n2);


    }



    public static void MaxNumFrom2num(double n1,double n2){



        String result ="";

        if(n1>n2){
            result="Maximum number is: "+n1;
        }else{
            result="Maximum number is: "+n2;
        }


        System.out.println(result);

    }








}

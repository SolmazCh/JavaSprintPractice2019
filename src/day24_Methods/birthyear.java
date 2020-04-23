package day24_Methods;

import java.util.Scanner;

public class birthyear {


    public  static  void Age(int birthyear){ //2000
      Scanner scan = new Scanner(System.in);

        System.out.println("Enter the current year");
        int currenYear = scan.nextInt();
        int age = currenYear-birthyear;

        if(birthyear<currenYear) {
            System.out.println(age);
        }else{
            System.out.println("You are not born yet");
        }
    }


    public static void main(String[] args) {

        int a=2002;

       // Age(a);

        printHelloCybertek();
    }


    public static void printHello(){
        System.out.println("Hello");
    }


    public static void printCybertek(){
        System.out.println("Cybertek");
    }


    public static void printHelloCybertek(){
        printHello();
        printCybertek();
    }






}

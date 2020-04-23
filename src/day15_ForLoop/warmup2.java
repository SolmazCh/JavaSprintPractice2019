package day15_ForLoop;

import java.util.Scanner;

public class warmup2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");

        String username = scan.next();

        System.out.println("Enter your password:");

        String password = scan.next();

        username = username.toLowerCase();

        username = username.toUpperCase();


        if(!username.endsWith("@gmail.com")){

            System.out.println("It's not a valid email");

        }else if(username.endsWith("@gmail.com") && !username.equals("cybertek.batch17@gmail.com") || !password.equals("JavaBeauties") ){

            System.out.println("Invalid username or password");
        }















    }
}

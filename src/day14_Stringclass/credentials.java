package day14_Stringclass;

import java.util.Scanner;

public class credentials {

    public static void main(String[] args) {

          /*
             userName: cybertek
             password: cybertekschool
              */


          String Validusername = "cybertek";
          String validPassWord = "cybertekschool";

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your username");

        String inputusername = scan.next();

        System.out.println("Enter your password");

        String inputpassword = scan.next();

        boolean validCredentials =inputpassword.equals(Validusername) && inputpassword.equals(validPassWord);

        if(validCredentials){

            System.out.println("Log in successfully");

        }else{

            System.out.println("Invalid credentials");

        }













    }
}

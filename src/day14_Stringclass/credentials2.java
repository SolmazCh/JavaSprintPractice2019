package day14_Stringclass;

import java.util.Scanner;

public class credentials2 {

    public static void main(String[] args) {

        /*
        valid credentials are:
        username: cybertek
        password: cybertekschool
   precondition: username and pasword cannot be empty, if empty output "please enter the credentials
        if user entered both valid username and password ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both are invalid ==> invalid username and password;

         */

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your username");

        String inputUsername = scan.next();

        scan.nextLine();

        System.out.println("Enter your password");

        String inputpassword = scan.next();

        scan.nextLine();

        boolean logedIn = inputUsername.equals("Cybertek") && inputpassword.equals("cybertekschool");
                // user entered both valid username and password

        boolean invalidusername = ! inputUsername.equals("Cybertek") && inputpassword.equals("cybertekschool");
                   // user entered invalid username, valid password

        boolean invalidPassword =  inputUsername.equals("Cybertek") && ! inputpassword.equals("cybertekschool");
                     // user name is valid, but password is invalid

        if(!inputUsername.isEmpty() && !inputpassword.isEmpty()){// username and password are not empty

            if(logedIn){
                System.out.println("Logged in");
            }else if(invalidusername){
                System.out.println("Password is correct, username is incorrect");
            }else if(invalidPassword){
                System.out.println(("Username is correct, password  is incorrect"));
            }else{
                System.out.println("Both username and password are incorrect");
            }







        }else{  // username and password are  empty
            System.out.println("Please enter the credentials");
        }
































    }
}

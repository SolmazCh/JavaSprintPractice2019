package RepeatStringTasks;

import java.util.Scanner;

public class validCredentials {

    public static void main(String[] args) {


      Scanner scan = new Scanner(System.in);

        System.out.println("Enter username:");

        String username =scan.next();

        System.out.println("Enter password");

        String password =scan.next();

        String result ="";

        if(username.equals("cybertek") && password.equals("cyberteks")){
            result = "logged in";
        }else if(!username.equals("cybertek") && password.equals("cyberteks")){
            result = "username is incorrect";
        }else if (username.equals("cybertek") && !password.equals("cyberteks")){
            result = "password incorrect";
        }else{
            result = "invalid user or passw";
        }

        System.out.println(result);





    }
}

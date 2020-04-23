package Replit_Solutions;

import java.util.Scanner;

public class swap {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String email = scan.next();



        if( email.contains("_") ){


            String  name  = email.substring(0, email.indexOf("_") );

            String lastname = email.substring(email.indexOf("_")+1 , email.indexOf("@"));

            String mail = email.substring(email.indexOf("@"));

            String result = lastname+"_"+name+mail ;

                        System.out.println(result);

                }else{
                         System.out.println(email);
                 }







    }
}

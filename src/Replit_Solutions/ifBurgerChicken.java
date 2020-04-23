package Replit_Solutions;

import java.util.Scanner;

public class ifBurgerChicken {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        String str = s.next();


        if (str.equals( "burger") || str.equals("chicken") ){
            System.out.println("10.0");
        }
        if(str.equals("soda")){
            System.out.println("2.0");
        }


    }
}
package Replit_Solutions;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result =1;

        for(int i=n; i>=1; i--){

            result*=i;

        }

        System.out.println(result);


    }
    }

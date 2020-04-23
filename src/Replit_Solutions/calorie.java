package Replit_Solutions;

import java.util.Scanner;

public class calorie {

        public static void main(String[] args) {

            double weight = 0;

            double cal = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter weight in pounds:");

            weight = scan.nextDouble();


            int runMET = 10*30;

          int  basketballMET = 30*8;

          int sleepMET = 6*60*1;

           int sumMET = runMET+basketballMET+sleepMET;

           double weightkg =weight/2.2;

           cal =0.0175*sumMET*weightkg;

          int cal1 =(int)cal;

            System.out.println("Calories Burned: "+cal1 );










        }
    }
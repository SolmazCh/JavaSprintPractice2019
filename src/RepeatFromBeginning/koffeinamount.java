package RepeatFromBeginning;

import java.util.Scanner;

public class koffeinamount {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

     /*
    Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose.

Write a program with a variable that holds the number of milli-
grams of caffeine in a drink and outputs how many drinks it takes to kill a person.

A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.

In one gram there are 1000 mg.   */


        System.out.println("Enter number of milligrams in drink: ");

         double milligrams = scan.nextDouble();

         double drink = 10000 / milligrams ;
        System.out.println("It would take about " +drink +" drinks for a lethal overdose");










    }
}

package day23_Methods;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score please");
        int score = scan.nextInt();
        Grade(score);

    }


    public static void Grade(int score){


     String result = (score<=100 && score>=90) ? "A": (score<=89 && score>=80) ? "B" :
                (score<=79 && score>=70) ? "C" : (score<=69 && score>=60) ? "D" :
                        (score<=59 && score>=0) ?  "F" : "Invalid score";

        System.out.println(result);

    }







}

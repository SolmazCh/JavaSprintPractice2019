package day11_Scanner;

import java.util.Scanner;

public class Scanner_gradeofstudent {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade: ");

        int grade = scan.nextInt();

        String result = " ";

        if(grade<60){
            result = "Fail";
        }else if (grade>=60 && grade<90){
            result = "Pass";
        }else if(grade>=90 && grade<=100){
            result = "Passed with Distinction";
        }else{
            result = "Incorrect enter";
        }

        System.out.println(result);






    }
}

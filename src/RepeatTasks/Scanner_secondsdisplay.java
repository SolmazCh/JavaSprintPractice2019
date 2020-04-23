package RepeatTasks;

import java.util.Scanner;

public class Scanner_secondsdisplay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter seconds: ");


        int inputseconds = scan.nextInt();



        int hours = (inputseconds/3600 );

        int minutes =(inputseconds-3600*hours)/60;

        int seconds =inputseconds-3600*hours-60*minutes;

        System.out.println(hours+":"+minutes+":"+seconds );





    }
}

package RepeatLoopAndArrayTasks;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] months = {"Jan", "Feb", "Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};


        System.out.println("Enter a number");

        int num = scan.nextInt();

        int attends = 0;



        while(num<=0 || num>12) {
            System.out.println("Invalid Entry, please re-enter");
            num = scan.nextInt();
            attends++;


            if(attends==2){
                System.out.println("You lost your opportunity, bye!");
                System.exit(0);
            }


        }


        System.out.println("Month name is: "+months[num-1]);




    }
}

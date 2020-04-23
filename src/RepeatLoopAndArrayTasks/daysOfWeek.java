package RepeatLoopAndArrayTasks;

import java.util.Scanner;

public class daysOfWeek {

    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = scan.nextInt();

        int attends =0;

        while (num<=0 || num>7){
            System.out.println("Invalid entry, please re-enter");
            num = scan.nextInt();
            attends++;

            if(attends==2){
                System.out.println("You can not enter a number more than 3 times. Good bye!");
                System.exit(0);
            }
        }

        System.out.println(days[num-1]);


    }
}

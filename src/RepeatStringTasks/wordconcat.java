package RepeatStringTasks;

import java.util.Scanner;

public class wordconcat {

    public static void main(String[] args) {


        Scanner scan = new Scanner((System.in));

        System.out.println("Enter two words");

        String word1 = scan.next();

        String word2 =  scan.next();

        String result = word1.substring(1).concat(word2.substring(1));

        System.out.println(result);









    }
}

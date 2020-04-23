package RepeatStringTasks;

import java.util.Scanner;

public class midchar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");

        String word = scan.next();

        String result ="";

        if(word.length()%2==0){

            result =word.substring( word.length()/2-1, word.length()/2+1) ;

        }else{

            result =word.substring(word.length()/2, word.length()/2+1);
        }

        System.out.println(result);





    }
}

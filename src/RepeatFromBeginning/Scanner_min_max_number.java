package RepeatFromBeginning;

import java.util.Scanner;

public class Scanner_min_max_number {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);


        System.out.println("Enter three numbers:");

        int num1 = scan.nextInt();

        int num2 =  scan.nextInt();

        int num3 = scan.nextInt();

        int minnum, maxnum ;

        if(num1>num2 && num1>num3){

            maxnum = num1;
        }else if(num2>num1 && num2>num3){

            maxnum = num2;

        }else{
            maxnum = num3;
        }

        System.out.println("Maximum number is: "+ maxnum);


        if(num1<num2 && num1<num3){
            minnum = num1;
        }else if(num2<num1 && num2<num3){
            minnum = num2;
        }else{
            minnum = num3;
        }


        System.out.println("Minimum number is: "+minnum);






    }
}

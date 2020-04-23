package day12_JavaRecap;

import java.util.Scanner;

public class AscendingOrder_task {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        String result = "";

       if( num1<num2 && num1<num3 && num2<num3){
           result = ( num1+", "+num2+", "+num3);

       }else if(num1<num2 && num1<num3 && num3<num2){

           result = (num1+", "+num3+", "+num2);

        }else if(num2<num1 && num2<num3 && num1<num3){

           result =(num2+", "+num1+", "+num3);

       }else if(num2<num1 && num2<num3 && num3<num1){

           result =(num2+", "+num3+", "+num1);
       }else if(num3<num1 && num3<num2 && num1<num2){

           result =(num3+", "+num1+", "+num2);

       }else if(num3<num1 && num3<num2 && num2<num1){

           result=(num3+", "+num2+", "+num1);
       }

        System.out.println(result);



    }
}

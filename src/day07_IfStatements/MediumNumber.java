package day07_IfStatements;

public class MediumNumber {
    public static void main(String[] args) {
     /*
      write a java program that accepts three numbers and return
     the medium number
                (assume that none of them are equal)
      */


        int num1 = 45;
        int num2 = 54;
        int num3 = 52;


        if(num1>num2 && num1<num3 || num1<num2 && num1>num3){
            System.out.println("The Medium number is:"+num1);
        }

        if(num2>num1 && num2<num3 || num2<num1 && num2>num3){
            System.out.println("The Medium number is:"+num2);
        }


        if(num3>num1 && num3<num2 || num3<num1 && num3>num2){
            System.out.println("The Medium number is:"+num3);
        }







    }
}

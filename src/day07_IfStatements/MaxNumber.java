package day07_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {

        double num1 = 72;
        double num2 = 55;
        double num3 = 64;

        if(num1>num2 && num1>num3){
            System.out.println(" The Maximum number is:"+num1);
        }

        if (num2>num1 && num2>num3){
            System.out.println("The Maximum number is:"+num2);
        }

        if(num3>num1 && num3>num2){

            System.out.println("The Maximum number is:"+num3);
        }












    }
}

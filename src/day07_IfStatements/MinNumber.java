package day07_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        int num1 = 72;
        int num2 = 55;
        int num3 = 64;


        if(num1<num2 && num1<num3){
            System.out.println("The Minimum number is:"+num1);
        }


        if(num2<num1 && num2<num3){
            System.out.println("The Minimum number is:"+num2);
        }


        if(num3<num1 && num3<num2){
            System.out.println("The Minimum number is:"+num3);
        }




    }
}

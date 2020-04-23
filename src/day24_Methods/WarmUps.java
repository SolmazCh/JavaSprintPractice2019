package day24_Methods;

public class WarmUps {


    public static void Max(int num1, int num2){

        if(num1>num2){
            System.out.println("Maximum number is: "+num1);
        }else{
            System.out.println("Maximum number is: "+num2);
        }

    }


    public static void Calculation(double num1, double num2, char operator){



        switch(operator){

            case '+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;

            case '*':
                System.out.println(num1*num2);
                break;

            case '/':
                if(num2==0){
                    System.out.println("Division can not be zero");
                    break;
                }
                System.out.println(num1/num2);
                break;

            default:
                System.out.println("Invalid");

        }
    }


    public static void palindrome(String str){
        String reverse ="";

        for(int i=str.length()-1; i>=0; i--){
            reverse+=""+str.charAt(i);
        }


        System.out.println(str.equalsIgnoreCase(reverse));
    }



    public static void main(String[] args) {
        int a =1000;
        int b =0;

        String word ="Level";

        Max(a,b);

        Calculation(a,b,'/');

        palindrome(word);
    }












}

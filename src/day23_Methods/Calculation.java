package day23_Methods;


public class Calculation {
    public static void main(String[] args) {
        Calculation();
    }

    public static void Calculation() {
        double num1 = 5;

        double num2 = 15;

        String operator = "+";

        String result = "";

        if (operator.equals("+")) {
            result = "" + (num1 + num2);
        } else if (operator.equals("-")) {
            result = "" + (num1 - num2);
        } else if (operator.equals("*")) {
            result = "" + (num1 * num2);
        } else if (operator.equals("/")) {
            result = "" + (num1 / num2);
            if (num2 == 0) {
                System.out.println("division can not be zero");
                System.exit(0);
            }
        } else if (operator.equals("%")) {
            result = "" + (num1 % num2);
        } else {
            result = "Invalid operator";
        }


        System.out.println(result);
    }



}

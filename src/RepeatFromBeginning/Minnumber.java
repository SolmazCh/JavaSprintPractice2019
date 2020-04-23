package RepeatFromBeginning;

public class Minnumber {

    public static void main(String[] args) {


        double num1 = 225.90;
        double num2 = 545;
        double num3 = 54.64;

        String minnum = " ";

        boolean num1min = num1<num2 && num1<num3;
        boolean num2min = num2<num1 && num2<num3;
        boolean num3min = num3<num1 && num3<num2;

        if(num1min){
            minnum = num1+" is a minimum number";

        }else if(num2min){
            minnum = num2+" is a minimum number";
        }else{
            minnum = num3+" is a minimum number";
        }
        System.out.println(minnum);











    }
}

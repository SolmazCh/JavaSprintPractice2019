package RepeatFromBeginning;

public class maxNum {

    public static void main(String[] args) {


        int num1 = 455;
        int num2 = 115;
        int num3 = 90;

        String maxnum = "max";

        if(num1>num2 && num1>num3){
            maxnum = num1+" is a maximum number";

        }else if(num2>num1 && num2>num3){
            maxnum = num2+" is a maximum number";
        }else{
            maxnum = num3+" is a maximum number";
        }

        System.out.println(maxnum);







    }
}

package RepeatFromBeginning;

public class mediumnum {

    public static void main(String[] args) {


        int num1 = 70;
        int num2 = 90;
        int num3 = 80;

        String mediumnum = " medium";

        if(num1>num2 && num1<num3 || num1<num2 && num1>num3){
            mediumnum = num1+" is a medium number";
        }else if(num2>num1 && num2<num3 || num2>num3 && num2<num1){
            mediumnum = num2+" is a medium number";
        }else{
            mediumnum = num3+" is a medium number";

        }


        System.out.println(mediumnum);













    }
}

package day08_IfStatements;

public class EqualNumber_Multibrands {

    public static void main(String[] args) {

        double n1 = 0.5;
        double n2 = 0.5;
        double n3 = 50.5;

        String result = "M";


        if(n1==n2 && n1!=n3){
            result ="n1 is equal to n2";
        } else if(n1==n3 && n1!=n2) {
            result= "n1 is equal to n3";

        } else if (n2 == n3 && n2 != n1) {
            result = "n2 is equal to n3";
        } else if (n1 == n2 && n1 == n3) {
            result="All are equal";
        } else {
            result="None of them are equal";
        }




    }
}

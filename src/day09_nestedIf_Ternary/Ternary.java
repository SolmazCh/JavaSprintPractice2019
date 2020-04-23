package day09_nestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num=100;

        String result="";

        if(num%2==0){
            result = "even";
        }else{
            result= "odd";
        }

          String result2 = (num%2==0) ?"even" :"odd";

        System.out.println(result);
        System.out.println(result2);

        System.out.println("================================================================================");

          int num1 = 100;
          int num2 = 200;
          int max = 0;


          if(num1>num2){
              max = num1;
          }else{
              max = num2;
          }



          int max2 = (num1>num2) ? num1 : num2;

        System.out.println(max);
        System.out.println(max2);

        System.out.println("=============================================================================");


        String str ="";


        if(true){
            str = "Hello";
        }else{
            str = "Hola";
        }

        System.out.println(str);
        String str2 =(true) ? "Hello" : "Hola";

        System.out.println(str2);

        String grader ="";
        if(9>10){
            grader ="9 is greater";
        }else{
            grader="10 is greater";
        }


        String grader2 =(9>10) ? "9 is greater" : "10 is greater";


        System.out.println(grader);
        System.out.println(grader2);
        System.out.println("=================================================================================");



        int age =23;
        boolean eligibility =  (age >=21) ? true : false ;
     /*
        if(age>=21){
            eligibility = true;
        }else{
            eligibility=false;
        }
        */


        System.out.println(eligibility);

        System.out.println("==========================================================================");


        int ageofperson = 20;

        String eligibletovote = "";

        if(ageofperson>=18){
            eligibletovote = "yes";
        }else{
            eligibletovote = "no";
        }
        System.out.println(eligibletovote);

        String eligibletovote2 = (ageofperson>=18) ? "yes" : "no";
        System.out.println(eligibletovote2);




















































    }
}


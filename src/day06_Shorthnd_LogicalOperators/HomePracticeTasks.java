package day06_Shorthnd_LogicalOperators;

public class HomePracticeTasks {

    public static void main(String[] args) {


        int ApplesCount = 20;
        int OrangeCount=30;
        int PearCount =30;

        boolean comp = ApplesCount< OrangeCount || OrangeCount>=PearCount;

        // comp = 20<30 || 30>=30 // true || true == TRUE
        System.out.println(comp);

        System.out.println("===============================================");

       String OutsideWeather;
       int Degree;
       OutsideWeather = "Shiny";
       Degree =70;
       boolean comp2 =(!(OutsideWeather=="Rainy"||Degree==70));
       // comp2 = !( False || True) = !( True) = false

        System.out.println(comp2);
        System.out.println("================================================");


           int num1=300;
           int num2=220;
            boolean TrueOrFalse = num1>num2;
        System.out.println("First number "+num1+" is greater than the second number "+num2+":"+TrueOrFalse);
        System.out.println("===============================================");


        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
        // res = 3 == 2 || 2 == 2 && 1 == 2;
        // res = false || true && false;
        // res true && false = false
        //res false || false = false;  // RESULT FALSE ANYWAY;


        System.out.println(res);

        System.out.println("=========================================");

        boolean x = true, z = true;
        int y = 20;
        x = (y!=10) || (z = false);

        // x = 20 != 10 || true = false
        // x = true || false == TRUE

        System.out.println(x);
        System.out.println("======================================");


        double q =20;
        double w =80;
        double inum =(( q+w) *25)%40; // 2500%40 =20
        boolean TruesofFalse = inum<=q;
        System.out.println("Total "+inum + " is equal to "+q +" or less:"+TruesofFalse);

        System.out.println("====================================");

        int age = 18;
        if (age>=18){
            System.out.println("You are eligible to vote");
        }


        System.out.println("===================================");
        int number1 = 4;
        int number2 = 8;
        int number3 = 1;

        if (number1>number2 && number1>number3){
            System.out.println("The greatest number is:"+number1);
        }

        if (number2>number1 && number2>number3){
            System.out.println("The greatest number is:"+number2);
        }


        if (number3>number1 && number3>number2){
            System.out.println("The greatest number is"+number3);
        }

        System.out.println("==========================================");


       int h = 300;
       int j = 300;

       if(h==j){
           System.out.println("equel");
       }

        System.out.println("==================================");
          int hour = 22;
          boolean dayhours = hour>0 && hour<24;
       if(hour<12){
           System.out.println("Good Morning");
       }

       if(hour>=12 && hour<15){
           System.out.println("Good Afternoon");
       }


       if(hour>=15){
           System.out.println("Good Evening");
       }

        System.out.println("============================================");

         int numberOfWaterMelon;
         boolean lotsOfWaterMelon;
         lotsOfWaterMelon=false;

         numberOfWaterMelon=40;

         if(numberOfWaterMelon>=20){
             System.out.println("I have more than 20 watermelon");
             lotsOfWaterMelon = true;
         }

       if (lotsOfWaterMelon){
           System.out.println("Good Job");
       }

       if (lotsOfWaterMelon==false){
           System.out.println("I need more watermelon");
       }

       /* output will be
       int numwat= 40;




        */







    }







}

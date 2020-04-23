package day06_Shorthnd_LogicalOperators;

public class SingleIfstatment {

    public static void main(String[] args) {

      boolean coldWeather = false;
      if (coldWeather){
          // true

          System.out.println("Wear your hat");
          System.out.println("Wear your jacket");

      }

      boolean coronaDetected = true;
        if (coronaDetected){

            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding");

            System.out.println("========================================");


            int a=201;

            boolean evennumber = a%2==0; // if a number can be devided by 2 without the remainder
             if (evennumber){
                 System.out.println(a +" is even number ");


             }
              //int b = 51;
             //boolean oddnumber = b%2 !=0; // if the number can not be devided by 2 evenly


            if(!evennumber){

                System.out.println(a +" is odd number");

            }






            System.out.println(evennumber);

        }












    }




}

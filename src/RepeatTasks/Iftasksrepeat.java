package RepeatTasks;

public class Iftasksrepeat {
    public static void main(String[] args) {

      // task1

        int age = 27;

        if(age>=18){
            System.out.println("You are eligible to vote");
        }


        System.out.println("===========================================================================");

       //task2

         int num1 = 4;
         int num2 = 8;
         int num3 = 1;

         String greaternum = "";

         if(num1>num2 && num1>num3){
             greaternum = "num1";
         }else if (num2>num1 && num2>num3){
                greaternum = "num2";
            }else{
             greaternum = "num3";
         }


        System.out.println(greaternum);
        System.out.println("=============================================================================");

       //task3

        int number = 36;
        boolean evennum = true;
         if(number%2==0){
             evennum = true;
         }else{
             evennum = false;
         }


        System.out.println(evennum);

        System.out.println("==================================================================================");

        //task4

        double angle1 = 50;
        double angle2 = 50;
        double angle3 = 80;

        double triangle = (angle1 +angle2 +angle3);

           if(triangle==180){
               System.out.println("It is a triangle");
           }else{
               System.out.println(" It is not a triangle");
           }


          // task5













    }
}

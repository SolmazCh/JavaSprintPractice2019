package day07_IfStatements;

public class If_else_Statements {

    public static void main(String[] args) {

      int number=101;

     /* if(number%2==0){
          System.out.println(number+" is even number");
      }

      if(number%2!=0){
          System.out.println(number+" is odd number");
      }  */


     boolean evenNum = number%2 ==0;
      if(evenNum){
          System.out.println(number+" is even number");
      } else { //otherwise
          System.out.println(number + " is odd number");
      }


      int age =21;

      if(age>=21){
          System.out.println("Here is your vodka");
      } else {
          System.out.println("Go home kid");
      }


      boolean testedpositiveForCorona =false;

      if(testedpositiveForCorona){
          System.out.println("Buy more toilet papers and stay home");
      } else{
          System.out.println("Do more coding");
      }

















    }
}

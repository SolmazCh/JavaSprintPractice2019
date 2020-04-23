package RepeatTasks;

public class dividetwonum {

    public static void main(String[] args) {
         /*1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

        10/3 ==> 3 with a remainder of 1

        a= a-b =7;
        a= a-b =4;
        a= a-b =1;

        COUNT = 3; a=1;

         */

         int a=10; int b =3;
         int count =0;
         if(b==0){
             System.out.println("Division can not be zero");
             System.exit(0);
         }



         while(a>=b) {
             a -= b;
             count++;
         }
             if(a==0){
                 System.out.println("result is: "+count);
             }else{
                 System.out.println("result is: "+count+" with a remainder: "+a);
             }












    }
}

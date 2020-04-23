package Quiz_Practice;

public class Quiz_Assignment2_practice {

    public static void main(String[] args) {


                  int num = 9;

                  if(num++ == 10){   // line 1
                      System.out.println("Hello World"+num); // line 2

                  }else{
                      System.out.println("Hello Universe "+num);  //line 3
                  }

        System.out.println("=================================================================");


              int score=0;

               if(score ==0)  {  //true
                   score += 50;
               }


                  if(score !=0) { // score=50 == true
                      score +=50;
                  }

        System.out.println(score);


        System.out.println("============================================================");

            boolean A = true , B = !false;

            if(B){
                System.out.println("B");
            }else if(A){
                System.out.println("A");
            }else {
                System.out.println("C");
            }

        System.out.println("============================================================");

        boolean result = true;




     if(5==5){
         System.out.println("true");
     }
        System.out.println("==================================================================");



             boolean a = true, b = !a;

             if(a){
                 if(b){
                     System.out.println("Monday");
                 }else{
                     System.out.println("Tuesday");
                 }
             }else {
                 if(a){
                     System.out.println("Thursday");
                 }else{
                     System.out.println("Friday");
                 }
             }

        System.out.println("====================================================");


                    int number = 10;

                  if(--number >10){
                      System.out.println("Hello Cybertek "+number);
                  }else if(number == 9){
                      System.out.println("Hello World "+number);
                  }
        System.out.println("=============================================================");

                  boolean X = true;
                  boolean Y = !X == false;
                  boolean Z=Y;

                  if(X){
                      System.out.println("Hello Everyone");
                  }

                  if(Y){
                      System.out.println("Today is great day");
                  }

                  if(Z){
                      System.out.println("We are improving everyday");
                  }
















    }

}

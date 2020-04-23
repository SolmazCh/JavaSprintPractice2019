package day18_Nestedloop;

public class Nested_Loop {

    public static void main(String[] args) {

for(int j =0; j<8; j++ ) {

    for (int i = 1; i <= 5; i++) {

        System.out.print(i+" ");
    }

    System.out.println();
}

        System.out.println("=======================================================================");




      for(int i=0; i<7; i++) {  //outer loop repeating the inner loop over and over again

          int a = 0;
          while (a < 7) {

              System.out.print("* ");
              a++;
          }
          System.out.println();
      }








    }
}

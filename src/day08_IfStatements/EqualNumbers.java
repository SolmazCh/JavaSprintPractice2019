package day08_IfStatements;

public class EqualNumbers {

    public static void main(String[] args) {
        /*

          write a program that can check the equality of the three given numbers
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
            if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal

         */

            double n1 = 0.5;
            double n2 = 300.5;
            double n3 = 300.5;

      if(n1==n2 && n1!=n3){
          System.out.println("n1 is equal to n2");
      }

      if(n1==n3 && n1!=n2) {
          System.out.println("n1 is equal to n3");

      }
          if (n2 == n3 && n2 != n1) {
              System.out.println( "n2 is equal to n3");
          }

          if (n1 == n2 && n1 == n3) {
              System.out.println("All are equal");
          }

          if (n1 != n2 && n2 != n3 && n1 != n3) {
              System.out.println("None of them are equal");
          }

          // boolean noneEqual = n1Equaln2 == false && n1Equaln3 == false && n2Equaln3 ==false
          // boolean nonEqual = !n1Equaln2 && !n1Equaln3









    }



}

package day22_Arrays_Loops;

public class countevenandodd {
    /*
    4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop and continue statement
     */

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};

        int countevennum = 0;

        int countoddnum = 0;

        for (int eachnum : numbers) {
          /*  if (eachnum % 2 != 0) {
                countoddnum ++;
            }else {
                countevennum ++;
            }
*/

          if(eachnum%2 ==0){
              countevennum++;
              continue;
          }

          countoddnum++;

        }
            System.out.println("Even numbers count: "+countevennum);
            System.out.println("Odd numbers count: "+countoddnum);



    }

}
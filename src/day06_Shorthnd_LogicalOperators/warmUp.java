package day06_Shorthnd_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {

      /*1. write a java program that converts gallons to liters
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785



	 					*/



         double numberOfgallons = 5;

         double gallonstolitter = numberOfgallons*3.785;


           String result = numberOfgallons + " gallons equal to: "+gallonstolitter+ " liters";
        System.out.println(result);

        //=============================================
       /* 2. write a java program that converts litters to gallons
        1 gallon = 3.785 liters
        1 litter = 1/3.785
*/

       /*double litter1 = 1/3.785;
       double l =10;
       double gallon1 = l*litter1;

        System.out.println(gallon1);
        //======================================================
*/
        /*
        3. manually calculate the following code fragements:
				1. int a = 200;
					int b = -a++ + - --a * a-- % 2
					b = ?

         */


        double numberOfLiters = 100;

        double LiterstoGallons = numberOfLiters/3.785;

        String result2 = numberOfLiters+" liters equal to "+LiterstoGallons+" galons";

        System.out.println(result2);













         int a = 200;
         int b = -a++ + - --a * a-- % 2;
         // b = -200 + - 200* 200%2 = -200;

        int x = 300;
        int y = 400;
        int z = x+y-x*y+x/y;
        // z= 300+400-300*400+300/400=700-120000+0(cunki int kimi qebul edir)= -119300;
















    }









}

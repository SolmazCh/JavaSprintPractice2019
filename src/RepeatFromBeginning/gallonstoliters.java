package RepeatFromBeginning;

public class gallonstoliters {

    public static void main(String[] args) {

/*1. write a java program that converts gallons to liters
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785

	2. write a java program that converts litters to gallons
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785

 */
                            double amountofgallon = 8;

                            double onegallon = 3.785;

                           double gallontoliter = amountofgallon * onegallon ;

        System.out.println(amountofgallon+ " gallon is l"+gallontoliter);


        int a = 200;
        int b = -a++ + - --a * a-- % 2; //  b = -200 + - 200 * 200%2 = -200 + -0 = -200;


         int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;  // z= 300+400-300*400+300/400 = 700-120000+3/4 = 700-120000= -119300

         int g = x/y;
        System.out.println(b);
        System.out.println(z);
        System.out.println(g);

















    }
}

package day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {

        /*A triangle is valid if the sum of all the three angles is equal
to 180 degrees. Write a program that declares three integers as angles
and check whether a triangle is valid or not.
         */

        double angle1 = 40;
        double angle2 = 70;
        double angle3 = 70;

        short sumOfAngels =(short) (angle1+angle2+angle3);

        if(sumOfAngels==180){

            System.out.println("A shape is a triangle");

        }

        if(sumOfAngels!=180){

            System.out.println("The shape is not a valid triangle");
        }









    }
}

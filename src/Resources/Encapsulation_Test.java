package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        Encapsulation_Test obj2 = new Encapsulation_Test();

      //  obj2.SSN =1000;

      //  System.out.println(obj.SSN);

        System.out.println( obj.getSSN() );

        obj.setSSN(124578);
        System.out.println(obj.getSSN());







    }
}

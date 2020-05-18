package day40_Encapsulation;

import javax.crypto.spec.PSource;

public class Test {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
       // System.out.println(obj.SSN); private variable

        System.out.println(obj.getSSN());

      //  obj.SSN = 123456;

        obj.setSSN(123456);
        System.out.println(obj.getSSN());





    }






}

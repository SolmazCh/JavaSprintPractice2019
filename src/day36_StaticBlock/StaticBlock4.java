package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock4 {

    static String name = "Cybertek School";
    static Tester tester1 = new Tester();

    int insVariable;

  static{
        // get executed as soon as the class is loaded
        // designed to initialize static variables
        name = "Cybertek School";
        tester1.setInfo("Jean", "SDET",125000,231);
        tester1.setInfo("Namik","Developer",120000,1452);

      //  StaticBlock4 obj1 = new StaticBlock4();
     //   obj1.insVariable = 300;// Do not use static block for initializing instance variable
    }


    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariable);



    }



}

package day38_Constructors;
/*
First runs static block,
 */

public class Test {

    public Test(){
        System.out.println("Constructor");
    }



    static { // static is class member, so first get executed
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }





    public static void main(String[] args) {
        System.out.println("Main method");
        new Test();  // instance then constructor
        new Test();
    }





}

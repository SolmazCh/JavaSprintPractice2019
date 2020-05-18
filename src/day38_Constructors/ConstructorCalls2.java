package day38_Constructors;

public class ConstructorCalls2 {

    public  ConstructorCalls2(){
        System.out.println("Default constructor");
    }


    public ConstructorCalls2(int a){
      this(); // default constructor
        System.out.println("Constructor with int argument");
    }


    public ConstructorCalls2(String str){
       // System.out.println("Hello");
        this(5); // default and int arguments
      //  this() // you cannot call second constructor in one constructor, you can only call one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("");
    }

    public void method1(){

    }


    {

    }













}

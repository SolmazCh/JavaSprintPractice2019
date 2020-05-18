package day38_Constructors;
/*
this: refers to object instances
        this.: we can instances of the object
        this(): used for calling constructors within current class
constructor calls:
            1. only constructor can call other constructor
            2. constructor cannot be called by its name,  this() is used for calling
            3. constructor call needs to be at the first step
            4. One constructor can only call one constructor
            5. Contructor cannot call itself or conatin itself

 */

public class ConstructorCalls {

    public ConstructorCalls(){
        method1();
        method2();
    }

    public ConstructorCalls(int a){
       this();
    }

    public static void method1(){
      //  method2();
    }


    public  void method2(){
        method1();
    }








}

package day38_Constructors;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class ConstructorPractice {

    public ConstructorPractice(){
        this(0.5);
        System.out.println("A");
        //this(0.5) //rule #3
    }

    public ConstructorPractice(int a){
        this();
        System.out.println("B");
    }

    public ConstructorPractice(double a){
        //this(); rule #5
        // this(5.5) // #5
       // this(5); // #5
        System.out.println("C");
    }


    public static void main(String[] args) {
        new ConstructorPractice(10);
    }








}

package day38_Constructors;

public class ConstructorCall3 {

   public ConstructorCall3(){
       this(9);  // Int argument
       System.out.println("Default");
     // this(4); // you can not call constructor after sout
   }

    public ConstructorCall3(int a){
       //this(5); // constructor cannot call itself
       // this(); // you can not call default in this situation, as default already contains this constructor too,
        System.out.println("Int argument");
    }


    public  ConstructorCall3(String str){
       this();
    }

    public static void main(String[] args) {
         new ConstructorCall3();

    }







    public void method1(){
     //  this();
    }






}

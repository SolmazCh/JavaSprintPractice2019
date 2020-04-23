package day25_MethodsRecap;

public class return_statement {

    public static void main(String[] args) {

        method2();

        System.out.println("Hello");



    }


    public static void method1() {

        if(10>9){
            return;
        }

        System.out.println("Hello World");
    }



    public  static void method2(){

        if(10>9){
           System.exit(0);
        }

        System.out.println("Hello World");

    }














}
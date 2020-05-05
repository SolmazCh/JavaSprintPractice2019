package day26_MethodOverloading;

public class MethodOverloading {

    public static void main(String[] args) {
        Method(10); // "Original method"
        Method(10.0); // "Overloaded method"

    }

    public static void Method(int a) {
        System.out.println("Original method");
    }

    public static void Method ( double a){
            System.out.println("Overloaded method");
        }
















}

package day23_Methods;

public class oddnum_Methods {
    /*
    1. write a method that can print all odd number between 1 ~ 100
     */

    public static void main(String[] args) {

        odd100();
    }



    public static void odd100(){
        for(int i=1; i<=100; i++){

            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}

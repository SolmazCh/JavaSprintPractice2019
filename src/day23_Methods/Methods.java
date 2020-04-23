package day23_Methods;

import java.util.SortedMap;

public class Methods {

    public static void main(String[] args) {

        System.out.println("Hello Cybertek");

        printHelloWorld5();

        System.out.println("Hello Batch18");

        printHelloWorld5();

        System.out.println("Hello Saim");

        printHelloWorld5();
        System.out.println("==========================================================");

        evenNumbers1_100();

        oddNumbers1_100();
    }

        public static  void printHelloWorld5() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

        public static void evenNumbers1_100(){
            for(int i=1; i<=100; i++){

                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

        public static void oddNumbers1_100(){
        for(int i=1; i<=100; i++){

            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }






}

package OfficeHours.Practice_04_08_2020;

public class nestedLoop_Practice {

    public static void main(String[] args) {


        for(int k =0; k<=5; k++) {


            for (int i = 10; i <= 50; i += 10) {

                System.out.print(i + " ");
            }
        }

            System.out.println("==============================================");

        for(int b =0; b<=7; b++) {

            for (int a = 0; a <= b; a++) {

                System.out.print("* ");
            }

            System.out.println();

        }

    }
}

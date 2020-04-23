package day18_Nestedloop;

public class Triangle {

    public static void main(String[] args) {

        int f1=0;

        while(f1<7){

            int i1 =0;

            while(i1<f1){

                System.out.print("* ");

                i1++;
            }

            System.out.println();

            f1++;
        }



        int f=7;

        while(f>0){

            int i =0;

            while(i<f){

                System.out.print("* ");

                i++;
            }

            System.out.println();

            f--;
        }








    }
}

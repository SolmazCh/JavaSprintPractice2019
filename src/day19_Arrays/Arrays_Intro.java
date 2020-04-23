package day19_Arrays;

public class Arrays_Intro {

    public static void main(String[] args) {

       //  int scores = 90, 10, 20; //regular variables can only have 1 data

        /*
        declaration:
        Datatype[] dataname = {d1, d2, d3};
                     //index   0,   1,  2

        //70,80,90         */

        int[] scores = {70, 75, 85, 90, 95, 100};

       int num1 = scores[2];


        System.out.println(num1); //85, int

        int num2 = scores[5];
        System.out.println(num2);  // 100, int



        int[]  numbers ={1,2,3,4,5,6,7,8,9};

        int n1 =numbers[0];

        System.out.println(n1);

        int n2 =numbers[1];

        System.out.println(n2);



    }
}

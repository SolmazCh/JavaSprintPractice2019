package day18_Nestedloop;

public class do_While_Practice {

    public static void main(String[] args) {

     /*
     print all even numbers 0~100 in the same line separated by space
      */
        int i = 0;

        do{

            if(i % 2 !=0) {
                System.out.print(i + " ");

            }
                i++;

            }while (i <= 100);


        System.out.println();

        System.out.println("============================================================");

        int k = 1;

        do {
            System.out.println(k);
            k++;

        }while (k <= 5);


        System.out.println("==============================");


        int z = 1;

        do {
            System.out.println(z);
            if(z==2){
                break;
            }
            z++;

        }while (z <= 5);


        System.out.println("============================");


        int y=1;

        do{

            if(y==3){
                y++;  // need to make sure that iteredor is not skipping, so that the condition will be false
                continue;
            }
            System.out.println(y);

            y++;


        }while (y<=5);


        System.out.println("=============================================");

        int t =1;

        do {

            t++;

            if(t%2!=0){
                continue;
            }
            System.out.print(t+" ");


            t++;

        }while (t<=100);



    }
}

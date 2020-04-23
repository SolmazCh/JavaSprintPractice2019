package RepeatTasks;

public class Oddnum {

    public static void main(String[] args) {

        for(int i=1; i<=100; i+=2){

            if(i%15==0){
                System.out.println(i);
            }

        }


        for( int i=2; i<=100; i+=2 ){

            if(i%15==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        System.out.println("=======================================================================================");

        int sumeven =0;

        int sumodd=0;

        for(int i=0; i<=100; i++){

            if(i%2==0){

                sumeven+=i;
            }else{
                sumodd+=i;

            }
        }
        System.out.println("Evensum"+sumeven);

        System.out.println("oddsum"+sumodd);














    }


}

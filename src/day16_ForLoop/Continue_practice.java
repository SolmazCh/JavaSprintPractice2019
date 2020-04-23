package day16_ForLoop;

public class Continue_practice {

    public static void main(String[] args) {



        for(char ch = 'Z'; ch>='A'; ch--){       //S O L M A Z

            if( ch=='Y' || ch=='H' || ch=='J' || ch =='D') {

                continue;
            }

            System.out.print(ch+" ");

            }

        System.out.println();


        for(int i =0; i <=100; i++){

            if(i%3==0 || i%5==0){
                continue;
            }else if(i==23){
                break;
            }

            System.out.print(i+" ");




        }





    }
}

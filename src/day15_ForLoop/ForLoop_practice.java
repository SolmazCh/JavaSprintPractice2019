package day15_ForLoop;

public class ForLoop_practice {

    public static void main(String[] args) {

        /*
        odd numbers between 1~100 ina single line seperated by space
                  1 3 5 7 9 ......

         */

          String result ="";

        for( int number = 1; number<=100; number+=2 ){
           // System.out.print(number+" ");
            result += number+" ";
        }

        System.out.println(result);

        String resultEven ="";

        for( int number = 2; number<=100; number+=2){
            resultEven+=number+" ";

        }

        System.out.println(resultEven);






    }
}

package day22_Arrays_Loops;

public class NestedLoop2 {

    public static void main(String[] args) {


        int[][]  numbers ={  {9,8,7}, {6}, {5,4,3,2,1,0}  };


        for(int k=0; k<numbers.length; k++) {


            for (int i = 0; i < numbers[k].length; i++) {
                System.out.print(numbers[k][i]+" ");
            }

            System.out.println();

        }




        for(int k=0; k<numbers.length; k++){

            for(int i=numbers[k].length-1; i>=0; i-- ){
                System.out.print(numbers[k][i]+" ");
            }
        }


        System.out.println();
        for(int k=numbers.length-1; k>=0; k--){
            for(int i=0; i<numbers[k].length; i++){
                System.out.print(numbers[k][i]+" ");
            }
        }

        System.out.println();

        for(int k=numbers.length-1; k>=0; k--){
            for(int  i=numbers[k].length-1; i>=0; i--){
                System.out.print(numbers[k][i]+" ");
            }
        }


    }
}

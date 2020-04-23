package day22_Arrays_Loops;

public class evenNumbers {

    public static void main(String[] args) {

        /*
        1. create an int array called numbers that has length of 100
         2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement
         */


        int[] numbers = new int[100];

        for(int i=0; i<numbers.length; i++){
            numbers[i]=i+1;
        }


        for(int eacheven : numbers){

            if(eacheven%2!=0){
                continue;
            }

            System.out.print(eacheven+" ");
        }


















    }
}

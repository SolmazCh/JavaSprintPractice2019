package Replit_Solutions;

import java.util.Arrays;

public class AlterArray {
    public static void main(String[] args) {

        int[] array ={1,2,4,5,6,7};

        for(int i=0; i<array.length; i++){
            if(array[i]%2!=0){
            array[i]=array[i]*10;
            }else{
                array[i]=array[i]/2;
            }
        }

        System.out.println(Arrays.toString(array));






    }
}

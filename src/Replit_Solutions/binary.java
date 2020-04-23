package Replit_Solutions;

import java.util.Scanner;

public class binary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] binary = new int[8];
        int [] binarValue={128,64,32,16,8,4,2,1};
        int sum=0;
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
            if(binary[i]==1){
                sum+=binarValue[i];
            }
        }
        System.out.println(sum);
    }
}

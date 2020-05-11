package Replit_Solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_Diving {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Float> score = new ArrayList<>();
        float total=0;
        int k=1;
        for(int i=0; i<7; i++){
            System.out.println("Enter score for judge "+k+":");
             score.add(scan.nextFloat());
             k++;
        }
        Collections.sort(score);
        for(int i=1; i<score.size()-1; i++){
            total+=score.get(i);
        }
        System.out.println("Enter difficulty:");
        float difficulty =scan.nextFloat();
            total*=difficulty*0.6;

        System.out.printf("Total: %.2f", total);


    }
}

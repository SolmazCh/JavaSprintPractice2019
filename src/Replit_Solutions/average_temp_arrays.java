package Replit_Solutions;

import java.util.Scanner;

public class average_temp_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };


        for(double each  : temps){
            total+=k;
        }
        avgTemp = k/temps.length;

        System.out.println(avgTemp);




    }
}

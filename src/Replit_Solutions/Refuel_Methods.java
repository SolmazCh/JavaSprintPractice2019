package Replit_Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Refuel_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> deliveries = new ArrayList<>(Arrays.asList(3,3,1,2,6));

        int max_fuel =3;

        int result=0;

        for(int i=0; i<deliveries.size(); i++){
            if(deliveries.get(i)>=max_fuel){
             result +=deliveries.get(i)/max_fuel;
            }else if(deliveries.get(i)<max_fuel){
                result+=1;
            }

        }


        System.out.println(result);





    }
}

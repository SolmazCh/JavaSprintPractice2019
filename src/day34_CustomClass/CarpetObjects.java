package day34_CustomClass;

import day33_CustomClass.Car;

import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {


        Carpet carpet1 = new Carpet();
        carpet1.customOrder(5.5,10.5,590,false);

        Carpet carpet2 = new Carpet();
        carpet2.customOrder(2,6.5,250,true);

        Carpet carpet3 = new Carpet();
        carpet3.customOrder(4,7.5,820,true);

        Carpet carpet4 = new Carpet();
        carpet4.customOrder(7,8.5,389,false);

        Carpet carpet5 = new Carpet();
        carpet5.customOrder(3.5,5,120,true);

       // Carpet[] carpets ={new Carpet(), new Carpet(), new Carpet(), new Carpet(),new Carpet()};
      //   carpet[0].customOrder();
        Carpet[] carpets = {carpet1,carpet2,carpet3,carpet4,carpet5};

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpet = new ArrayList<>();


        for(Carpet each: carpets){
            if (each.isPersian) {
                persianCarpets.addAll(Arrays.asList(each));
            }else{
                regularCarpet.addAll(Arrays.asList(each));
            }
        }

        System.out.println(persianCarpets);
        System.out.println("===============================================");
        System.out.println(regularCarpet);
        System.out.println("======================================================");

        System.out.println("There are "+persianCarpets.size()+" persian carpets");
        System.out.println("================================================");
        System.out.println(persianCarpets.get(0).calcCost());

        System.out.println("There are "+regularCarpet.size()+" regular carpets");
        System.out.println("====================================");

        for(int i=0; i<regularCarpet.size(); i++) {
            System.out.println(regularCarpet.get(i).calcCost());
        }

    }
}

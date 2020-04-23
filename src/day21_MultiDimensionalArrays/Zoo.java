package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {


        String[] wildAnimals = {"Tigar", "Lion","Monkey","Turtle","Crocodile"};

        String[] birds ={"Eagle","Ducks","Peacock","Chicken"};

        String[][] zoo ={  wildAnimals, birds  };

       String chic= zoo[1] [3];

        System.out.println(chic);

        System.out.println("=====================================================");

        for(String eachBirds: zoo[1]){

            if(eachBirds.equalsIgnoreCase("Chicken")){
                continue;
            }
            System.out.println(eachBirds);
        }


        System.out.println("=====================================================");

        for(String eachAnimals: zoo[0]){

            if(eachAnimals.equalsIgnoreCase("monkey")){
                continue;
            }
            System.out.println(eachAnimals);
        }




    }
}

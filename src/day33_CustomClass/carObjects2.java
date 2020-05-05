package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObjects2 {
    public static void main(String[] args) {

        Car car1 = new Car();
       /*  car1.Brand = "Lexus";
        car1.model = "570";
        car1.year = 2019;
        car1.color = "Grey";*/
        car1.setCarInfo("Lexus","570",2019,"Grey");

        Car car2 = new Car();
       /*    car2.Brand = "Audi";
        car2.model = "Q8";
        car2.year = 2018;
        car2.color = "White";*/
        car2.setCarInfo("Audi","Q8",2018, "White");

        Car car3 = new Car();
       /* car3.Brand = "Hyundai";
        car3.model = "Tucson";
        car3.year = 2020;
        car3.color = "Red";*/
        car3.setCarInfo("Hyundai","Tucson",2020,"Red");

        Car car4 = new Car();
       /* car4.Brand = "Nissan";
        car4.model = "Armada";
        car4.year = 2015;
        car4.color = "Silver";*/
        car4.setCarInfo("Nissan","Armada", 2015, "Silver");

        Car car5 = new Car();
       /* car5.Brand = "Ford";
        car5.model = "Mustang";
        car5.year = 2020;
        car5.color = "Orange";*/
        car5.setCarInfo("Ford","Mustang",2020,"Orange");

        Car[] cars ={car1,car2,car3,car4,car5};
        for(int i=0; i<cars.length; i++){
            cars[i].getCarInfo();
        }

        System.out.println("=======================================================");

        for(Car each: cars){
            each.getCarInfo();
        }

        System.out.println("=====================================================");

        System.out.println(car1);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(list1);


    }
}

package day33_CustomClass;

public class carObjects {


    public static void main(String[] args) {
     Car car1 =  new Car();
     car1.Brand = "BMW";
     car1.model = "X6";
     car1.color = "Blue";
     car1.year = 2020;

       // System.out.println(Brand);
        System.out.println(car1.Brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        car1.start();
        car1.drive();

        System.out.println("=============================================================");
        Car car2 = new Car();
        car2.Brand ="Toyota";
        car2.model = "Prius";
        car2.year = 2020;
        car2.color = "black";

        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("===================================");

        Car car3 = new Car();
        car3.Brand = "Mercedes";
        car3.model = "C class";
        car3.year = 2020;
        car3.color = "Red";



        car3.getCarInfo();
        car3.start();
        car3.drive();
        System.out.println("========================================================");
        Car[] cars ={car1,car2,car3};

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();



    }
}

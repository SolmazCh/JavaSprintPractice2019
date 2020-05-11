package day37_Constructors;

public class CarsObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Lexus","LS",2020,75000);

        System.out.println(car1);
        System.out.println(car1.brand);

        Car car2 = new Car("Toyota", "Corolla",2015,11000);

        System.out.println(car2);


    }
}

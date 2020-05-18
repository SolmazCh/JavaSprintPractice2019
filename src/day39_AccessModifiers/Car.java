package day39_AccessModifiers;
/*
1. create a class called Car:
				instance variable:
						brand, model, year, price
				add a constructor that can initialize brand of car
				add a constructor that can initialize brand and model of the car
								(apply constructor call to initalize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method
 */

public class Car {
    String brand;
    String model;
    int year;
    double price;

    public  Car(String brand){
        this.brand=brand;
    }
    public Car(String brand, String model){
        this(brand);
        this.model=model;
    }
    public Car(int year, String brand, String model){
        this(brand,model);
        this.year=year;
    }
    public Car(int year, String brand, String model,double price){
        this(year,brand,model);
        this.price=price;
    }

    public String toString(){
        return "Year: "+year+"\nBrand: "+brand+"\nModel: "+model+"\nPrice: $"+price;
    }

}
class CarObjects{
    public static void main(String[] args) {
        Car car1=new Car("Toyota");
        System.out.println(car1);

        Car car2 = new Car("BMW", "X6");
        System.out.println(car2);

        Car car3 = new Car(2020,"Lexus", "LX570");

        System.out.println(car3);

    }
}
package day37_Constructors;

public class Car {
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand, String model, int year, double price){
        this.price=price;
        this.model=model;
        this.brand=brand;
        this.year=year;
    }


    public String toString(){
        return "Year: "+year+", Brand: "+brand+", Model: "+model+" Price: $"+price;
    }

}

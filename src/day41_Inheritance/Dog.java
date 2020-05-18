package day41_Inheritance;

public class Dog extends Animal{

    public void bark(){
        System.out.println(name+" is barking loudly");
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucky";

        System.out.println(dog1.name);

        dog1.move();

      //  dog1.swim(); can not declare here
        dog1.bark();




    }
}

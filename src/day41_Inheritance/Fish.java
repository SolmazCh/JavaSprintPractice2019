package day41_Inheritance;

public class Fish extends Animal {
    public static void main(String[] args) {

        Fish fish1 = new Fish();

        fish1.name ="Bubbi";
        fish1.weight=5;
        fish1.size="small";

        fish1.eat();
        fish1.move();
        fish1.swim();
       // fish1.bark();  // can not call this action as it is not in super class

    }

    public void swim(){
        System.out.println(name+" is swimming");
    }





}

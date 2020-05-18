package day38_Constructors;

public class dogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        System.out.println(dog1.name);//uknown
        System.out.println(dog1.age);//0
        System.out.println(dog1.breed);// unknown

        System.out.println("===================");

        Dog dog2 = new Dog("Muffi");

        System.out.println(dog2.breed); // null
        System.out.println(dog2.name); // muffi
        System.out.println(dog2.age); //0
        System.out.println("===================================================");

        Dog dog3 = new Dog("Poddle", 2);
        System.out.println(dog3.name);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);


        System.out.println(dog3);
        System.out.println(dog2);
        System.out.println(dog1);

        System.out.println("=======================");

        // Dog dog4 = new



    }
}

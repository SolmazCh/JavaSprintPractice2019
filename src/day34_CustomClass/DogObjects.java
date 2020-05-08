package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog[] dog ={ new Dog(), new Dog(), new Dog(),};

        dog[0].setDogInfo("Pomeranian","small",4,"Golden","Muffi");

        dog[1].setDogInfo("Alabay", "big",5,"Black","Toplan");

        dog[2].setDogInfo("German Shephard","large",7,"Brown","Wolf");

        dog[0].sleeping();
        dog[2].sleeping();
        dog[1].eating("chicken");

        System.out.println("=========================================");
        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog));

        for(Dog each: puppies) {
            System.out.println(each.name);
        }

        System.out.println("==============================================");

        puppies.removeIf(p-> p.age>4);
        System.out.println(puppies);
    }
}

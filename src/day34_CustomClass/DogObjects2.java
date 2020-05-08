package day34_CustomClass;

import javax.management.remote.rmi._RMIConnection_Stub;

public class DogObjects2 {
    public static void main(String[] args) {
        String food ="Chicken";
        String food2 ="meat";


        Dog dog1 = new Dog();
        dog1.setDogInfo("Chi hua Hua","Small",1,"Brown","Tuzik");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Pomeranian","small",4,"Golden","Muffi");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Kangal","Huge",5,"White","Comar");
        dog1.eating(food);
        dog2.eating(food2);

        dog2.playing("ball");

        System.out.println("========================================================");
        Dog[] dogPark = {dog1,dog2,dog3};

        for(int i=0; i<dogPark.length; i++){
            dogPark[i].eating("chicken");
        }

        for(Dog each: dogPark){
            each.playing("ball");
            each.studying("shaking hands");
        }
        String subject1 ="Java";
        String subject2 ="Art";
       for(int i=0; i<dogPark.length; i++){
           dogPark[i].studying(subject1);
       }

    }
}

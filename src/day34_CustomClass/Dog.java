package day34_CustomClass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;

    public void setDogInfo(String breed, String size, int age, String color, String name){
        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
        this.name=name;
    }

        public String toString(){
        String result = "Breed is: "+breed+"\nSize is: "+size+"\nAge is: "+age+"\nColor is: "+color+"\nName is: "+name;
        return result;
    }




}

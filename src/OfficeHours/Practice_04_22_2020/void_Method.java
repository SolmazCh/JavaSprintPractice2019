package OfficeHours.Practice_04_22_2020;

public class void_Method {

    public static void main(String[] args) {
        print();
        System.out.println("*******************************************************");

        boolean UScitizen =true;
        int age =51;
        Vote(age,UScitizen);

        System.out.println("*****************************************************************");

        Smoke(13);
    }

    public static void print(){
        for(int i=0; i<5; i++) {
            System.out.println("Hello Batch18");
        }
    }

    public static void Vote(int age, boolean USCitizen){
        boolean eligibleToVote = age>=18 && USCitizen==true;

        if(eligibleToVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote yet");
        }
    }

    public static void Smoke(int age){

        if(age>=18){
            System.out.println("Eligible to buy ");
        }else{
            System.out.println("Not eligible to buy");
        }
    }






}

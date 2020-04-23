package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {


        int personage = 15;
        boolean citizen=true;
        boolean eligible = personage>=18 &&citizen == true;

        if (eligible){
            System.out.println("You are eligible to vote.");
        }

        if (!eligible){
            System.out.println("You are not eligible to vote");
        }






    }
}

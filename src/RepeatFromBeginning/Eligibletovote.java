package RepeatFromBeginning;

public class Eligibletovote {

    public static void main(String[] args) {


        int age =38;
        boolean citizen = true;

        if(age>18){
            if(citizen) {
                System.out.println("You are eligible to vote!");
            }else {
                System.out.println("You are not eligible to vote as you are not a citizen!");
            }
        }else {
            System.out.println("You are not eligible to vote");
        }






    }
}

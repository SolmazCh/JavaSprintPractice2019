package day04_JavaRecap;

public class RemainderPractice {

    // 1897651 is odd
    public static void main(String[] args) {

       int number =  1897651;
       boolean oddNumber =number % 2 !=0;
        System.out.println("The number "+number+" is odd number "+oddNumber);



       boolean evenNumber = number % 2 ==0;
        System.out.println("The number "+number+" is even number "+evenNumber);

        boolean divisibleby3 = number%3 ==0;
        System.out.println("the number "+number+" is devesible by 3 "+divisibleby3);

         boolean divisibleby5 = number%5 ==0;
        System.out.println("the number "+number+" is devesible by 5 "+divisibleby5);



    }







}

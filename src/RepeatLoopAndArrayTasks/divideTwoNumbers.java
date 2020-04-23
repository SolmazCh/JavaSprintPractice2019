package RepeatLoopAndArrayTasks;

public class divideTwoNumbers {

    public static void main(String[] args) {


        int num1 = 17;

        int num2 = 5;

        int count =0;

        if(num2==0){
            System.out.println("Division can not be zero");
            System.exit(0);
        }

        while (num1>=num2){
            num1-=num2;
            count++;
        }

        if(num1==0){
            System.out.println("The result is: "+count);
        }else {
            System.out.println("The result is: " + count + " with a remainder: " + num1);

        }






    }
}

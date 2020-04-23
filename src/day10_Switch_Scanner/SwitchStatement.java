package day10_Switch_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
      byte a=4;
      // you cannot use these in switch
      float a1 = 4.5F;
      long a2 = 10L;
      double a3 = 10.5d;
      boolean a4 = true;
        switch (a){

            case 1:
                System.out.println("One");
                 break;

            case 2:
                System.out.println("Two");
                  break;

            case 3:
                System.out.println("Three");
                 break;

            default:
                System.out.println("Invalid case");
                  break;

            case 4:
                System.out.println("Four");
                break;

        }













    }
}

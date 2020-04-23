package Replit_Solutions;

public class palindrom {

    public static void palindrom(int num) {


    }


    public static void main(String[] args) {

      int a =1002;

      String num1 =""+a;

      String palindrom="";

      for(int i=num1.length()-1; i>=0; i--){
          palindrom+=num1.charAt(i);
      }

      if(num1.equals(palindrom)){
          System.out.println("true");
      }else{
          System.out.println("false");
      }

        System.out.println(palindrom);


    }


}
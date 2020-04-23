package day14_Stringclass;

public class Stringpanupilation2 {

    public static void main(String[] args) {

         String str = "  ";

         boolean bl = str.isEmpty();

        System.out.println(bl);

         String username = "";

         if(username.isEmpty()){
             System.out.println("please enter your name");


             String s1 = "Cat"; // string literal
             String s2 = new String("Cat");

             System.out.println(s1==s2); //false, different memory locations, different objects


             System.out.println(     s1.equals(s2)   ); // true because it differs only the text of string not the memory


             String z1 = "Tiger";
             String z2 = new String("Tiger");
             String z3 = "Tiger";
             String z4 ="line";
             // ==
             System.out.println(z1 ==z2); //false
             System.out.println(z2==z3);  //false
             System.out.println(z1==z3);  //true

             // equals method

             System.out.println(z1.equals(z2));  // true
             System.out.println(z2.equals(z3));  //true
             System.out.println(z1.equals(z3));  // true
             System.out.println(z3.equals(z4));  //false


             /*
             userName: cybertek
             password: cybertekschool
              */
















         }

    }
}

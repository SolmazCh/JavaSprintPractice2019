package day04_JavaRecap;

public class VariablesPractice {


    public static void main(String[] args) {

       //Data type Name =
       // byte num1 = 100.5 // byte, int, long, short only takes whole numbers
       byte nume1= 100;
       short s1 = nume1;
       int num2 = s1;
       int java = 23;
       double d2 = 10; // 10.0
        char ch1 = 'A'; //
        System.out.println(ch1);
        char ch2 = 45000;
        System.out.println(ch2);
        char ch3 =9800;
        System.out.println(ch3);

        int a1 = 'a';
        System.out.println(a1);

        int a2 = 'a'+'b';
        System.out.println(a2);
        // 97+98=195
        double dnum = 'a'+'b';
        System.out.println(dnum);


        double dnum2 = 'a';
        System.out.println(dnum2);

        char char1 = 'a';
        // byte byte1 = char1
        boolean bool1 = true;
        boolean bool2 = false;
        boolean result1 = 10>9;
        System.out.println(result1);
        boolean result2 = 10>=10;
        System.out.println(result2);
        System.out.println("Corona" =="Ebola"); //false
        System.out.println("Corona"!="Ebola"); //true
       // System.out.println("nine"==9);
        System.out.println('a'!=97);//false
                  // 97 != 97 false
        System.out.println(!true); // false
        System.out.println(!false); //true
        boolean r1=true != !false; //false
        System.out.println(r1);
        boolean r2 = !(9>10) != !(10>9); //(true != false) ==true
        System.out.println(r2);
        boolean r3 = !!!true; //false
        System.out.println(r3);





        // double>float>long>int>short>byte;








    }












}

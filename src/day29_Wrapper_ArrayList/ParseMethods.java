package day29_Wrapper_ArrayList;

import java.time.LocalDate;

public class ParseMethods {

    public static void main(String[] args) {

       String str ="123";

      int a1 = Integer.parseInt(str); //123

        System.out.println(str+1); // text   "123"+1 ==> "1231"

        System.out.println(a1+1); // number   123+1 ==> 124

              byte b1 = Byte.parseByte(str);  // byte =123

        System.out.println(b1+5);  //returns number

        Integer I1 =(int) Byte.parseByte(str); // AutoBoxing

        String str2 ="10.5";

       float f1 = Float.parseFloat(str2); // float 10.5

        System.out.println(f1);

        double f2 = Double.parseDouble(str2+1);  // 11.5

        System.out.println(f2);

        String str3 ="31474783647";

        long num1 =  Long.parseLong(str3);

        System.out.println(num1+2);

        Long num2 = Long.parseLong(str3); //autoboxing

        System.out.println(num2+2);


        String result1 ="Today is Monday"; // not true or false ==> false

       boolean r1 = Boolean.parseBoolean(result1);  //boolean

        System.out.println(r1);

        String result2 ="TrUe";  // returns true

        boolean r2=Boolean.parseBoolean(result2);

        System.out.println(r2);

        String result3 = "fAlSe"; // false

        boolean r3 = Boolean.parseBoolean(result2);  // ignores the case sensitivity

        System.out.println(r3);  //false

    }
}

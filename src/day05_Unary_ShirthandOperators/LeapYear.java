package day05_Unary_ShirthandOperators;

public class LeapYear {

    public static void main(String[] args) {



        /*
         1. create a class called LeapYear,
          and write a program that can identify
          if the given is Leap Year, print true
           if it's leap year, otherwise print
           false
        Ex:
            year = 2020

        output:
            2020 is leap year: true


         */

       short year = 2025;

       // leapYear: year%4
       // if returns true ==> leapyear;
        // if it returns false ==> not leapYear






       boolean Leapyear = year % 4 ==0; // if the year can be devided by 4 without any reminder,


      //  System.out.println(year+ " is leap year:"+Leapyear);

       String result = year+ " is leap year:"+Leapyear;
        System.out.println(result);



    }




}

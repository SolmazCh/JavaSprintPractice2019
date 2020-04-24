package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Practice {

    public static void main(String[] args) {

   LocalDate today = LocalDate.now();

        System.out.println(today);

        DateTimeFormatter DT = DateTimeFormatter.ofPattern("EEEE:MMMM:dd:YYYY");

        System.out.println(today.format(DT));

        LocalDate myBirthday = LocalDate.of(1990, 3,8);

        System.out.println(myBirthday.format(DT));

        boolean result1 = myBirthday.isAfter(today);

        System.out.println(result1);

        boolean result2 = myBirthday.isBefore(today);

        System.out.println(result2);

        boolean result3 = today.isLeapYear();

        System.out.println(result3);

        boolean result4 =today.isEqual(myBirthday);

        System.out.println(result4);

        System.out.println( today.getDayOfMonth());

        System.out.println(myBirthday.atTime(1,2,45));

 /*  LocalDate birthday = LocalDate.of(1990, 04, 25);
        int month =birthday.getMonthValue();
        int days =birthday.getDayOfMonth();
        if current dat== birthday ==> "Happy birthday!"
*/


        LocalDate sonBirthday = LocalDate.of(2016,4,24);

        int monthofbirth =sonBirthday.getMonthValue();

        int dayofbirth = sonBirthday.getDayOfMonth();

        LocalDate today2 = LocalDate.now();

       int todaysmonth = today2.getMonthValue();

       int todaysday = today2.getDayOfMonth();


       if(monthofbirth==todaysmonth && dayofbirth==todaysday){
            System.out.println("*******Happy Birthday*******");
       }else{
           System.out.println("Today is not your Birthday!");
       }









    }
}

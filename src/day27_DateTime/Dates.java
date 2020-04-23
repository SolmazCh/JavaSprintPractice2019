package day27_DateTime;

import java.time.LocalDate;

public class Dates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,10,25);

        System.out.println(date1);

        LocalDate myBirthday = LocalDate.of(1990,3,8);

        System.out.println(myBirthday);

        //isAfter(date2)

        boolean result1 = date1.isAfter(myBirthday);

        System.out.println(result1);

        // isBefore
        boolean result2 = date1.isBefore(myBirthday);

        System.out.println(result2);

        //isEqual
        boolean result3 = date1.isEqual(myBirthday);

        System.out.println(result3);

        //isLeapYear
        boolean result4 = myBirthday.isLeapYear();

        System.out.println(result4);

        System.out.println("======================================================");

        // now --> current date
        LocalDate now = LocalDate.now();

        System.out.println("Today is: "+now);


      /*  LocalDate birthday = LocalDate.of(1990, 04, 25);
        int month =birthday.getMonthValue();
        int days =birthday.getDayOfMonth();
        if current dat== birthday ==> "Happy birthday!"
*/
        String str = now.toString();

        System.out.println(str);


        System.out.println(str.replace("-",":"));


        // month/day/year





    }
}

package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        // for year yy or yyyy
        // for month MMM or MM or MMMM
        // for day dd
        //days name EEE for 3 letter of day Mon or EEEE for full name of day Monday
        // you can change places of date month or year
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MMM/dd/yy");
       LocalDate date1 =  LocalDate.now();
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthday = LocalDate.of(2020, 11, 10);

       String str2 = birthday.format(dtf2);
        System.out.println(str2);


        LocalDate date3 = LocalDate.now();

        System.out.println(date3.format(dtf));





    }



}

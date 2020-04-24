package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {

    public static void main(String[] args) {

        String[] friends = {"John", "Aaron", "Daniel"};

        LocalDate[] birthdays = {LocalDate.of(1985,10,23),
                                LocalDate.of(1990,3,5),
                                LocalDate.of(1987,8,10)};

       for(int i=0; i<friends.length; i++){
           System.out.println(friends[i]+"'s birthday is "+birthdays[i]);
       }





    }
}

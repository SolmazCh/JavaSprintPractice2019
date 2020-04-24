package day28_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datetime2 {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE MM/dd/yyyy");

        LocalDate dare2 = LocalDate.of(2019,3,20);

        System.out.println(dare2.format(dtf));













    }
}

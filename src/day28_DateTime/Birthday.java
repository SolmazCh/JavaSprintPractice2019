package day28_DateTime;

import java.time.LocalDate;

/*
    1.create an array of string, store five of your friends names in it
    2. create Array of local dates and store their birthdays in the same order
    3. use for loop to print out your friends' names and their birthdays

 */
public class Birthday {

    public static void main(String[] args) {

        String[] myFriends = {"Aysel", "Turkan", "Nigar", "Narmin", "Gunel"};
        LocalDate Aysel = LocalDate.of(1990, 4,25);
        LocalDate Turkan = LocalDate.of(1991,3,20);
        LocalDate Nigar = LocalDate.of(1987,12,14);
        LocalDate Narmin = LocalDate.of(1988,3,30);
        LocalDate Gunel = LocalDate.of(1988,10,5);

        String[] birthDates = new String[5];

        birthDates[0] =Aysel.toString();
        birthDates[1] =Turkan.toString();
        birthDates[2] =Nigar.toString();
        birthDates[3]=Narmin.toString();
        birthDates[4] =Gunel.toString();

        for(int i=0; i<myFriends.length; i++) {
            System.out.println(myFriends[i]+" "+birthDates[i]);
        }



    }
}

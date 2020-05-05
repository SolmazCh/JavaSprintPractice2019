package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class CountryList {
    /*
    3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
     */

    public static void main(String[] args) {

        Predicate<String > length10 = c -> c.length()>=10;
        ArrayList<String> countryNames = new ArrayList<>();

        countryNames.addAll(Arrays.asList("Azerbaijan", "America", "Brazil", "Singapur", "Great Britain"));

        countryNames.removeIf(length10);

        System.out.println(countryNames);








    }
}

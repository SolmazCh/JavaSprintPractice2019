package RepeatFromBeginning;

public class agename_ifternary {

    public static void main(String[] args) {


        /*3. write a program that can define the age groups of a person
             age groups are:
                    infant (< 1 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
                    if age > 120 or less than 0 ==> invalid entry
*/
        int age = 4;
        String result =(age<1)? "Infant": (age>=3 && age<=5) ? "Toddler": (age>=6 && age<=9)? "Kid":
                (age>=10 && age<=12)? "Pre-Teen": (age>=13 && age<=17) ? " Teenager": (age>=18 && age<=20)?
                        "Young adult" : (age>=21 && age<=39) ? "Adult" : (age>=40 && age<=49) ? "Young Midlleaged adult":
                        (age>=50 && age<=54)? "Middle aged adult": (age>=55 & age<=64) ? "Very young senior citizen":
                                "Senior citizen";

        System.out.println(result);




















    }
}

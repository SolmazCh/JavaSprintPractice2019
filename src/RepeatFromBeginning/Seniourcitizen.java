package RepeatFromBeginning;

import java.util.Scanner;
/*

-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

*/


public class Seniourcitizen {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens: ");

        int seniorCitizens = scan.nextInt();

        int nonSeniorCitizens = scan.nextInt();

        System.out.println("What is new citizen's age?");

        int age = scan.nextInt();

        if(age>= 65){
            System.out.println("Senior citizen");
            ++ seniorCitizens;
        }else{
            System.out.println("Non-Senior citizen");
            ++nonSeniorCitizens;
        }

        System.out.println("New seniorCitizens count " + seniorCitizens);

        System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);




    }
}

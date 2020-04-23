package RepeatStringTasks;

import java.util.Scanner;

public class initials {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = scan.next();

        System.out.println("Enter your last name:");

        String lastName =  scan.next();

       String initials =  name.substring(0,1).concat(lastName.substring(0,1));
           initials =   initials.toUpperCase();
        System.out.println(initials);


        String str = name.substring(0,3);
        str = str.substring(0,1).toUpperCase().concat(str.substring(1));
        System.out.println(str);


        String s1 = lastName.substring(0,1).toUpperCase().concat(lastName.substring(1));
        System.out.println(s1);

            scan.nextLine();

        System.out.println("Enter your full name:");

        String fullname = scan.nextLine();

       String  fullnameinitial = fullname.substring(0,1).toUpperCase().concat(fullname.substring(fullname.indexOf(" ")+1,fullname.indexOf(" ")+2 ).toUpperCase());


        System.out.println(fullnameinitial);




    }
}

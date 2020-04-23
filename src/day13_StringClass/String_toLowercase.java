package day13_StringClass;

public class String_toLowercase {

    public static void main(String[] args) {


        String name = "SolMaZ";

        String lastname = "chIrAGovA";

        String fullname = name.concat(" ".concat(lastname));

        String str1 = fullname.toLowerCase();

        System.out.println(str1);

       String str2 =name.toUpperCase().concat(lastname.toLowerCase());
        System.out.println(str2);





    }
}

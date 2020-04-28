package Replit_Solutions;

public class mixedcase {

    public static void main(String[] args) {

        String s ="BaNNanaaH";
        String result ="";

        for( int i=0; i<s.length();i++) {
            if (i % 2 != 0) {
                result += s.substring(i, i + 1).toUpperCase();

            } else {
                result += s.substring(i, i + 1).toLowerCase();
            }
        }
        System.out.println(result);



    }
}

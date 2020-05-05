package day26_MethodOverloading;

public class frequency_char_string {

    public static void main(String[] args) {

        String str = "ccckkdb";

        char ch = 'B';

        int k = frequency(str, ch);

        System.out.println(k);


        String unique = uniques(str);

        System.out.println(unique);
    }


    public static int frequency(String str, char ch) {

        char[] charr = str.toCharArray();
        int count = 0;
        for (char each : charr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
    public static String uniques(String str) {
        String result ="";

        for(int i=0; i<str.length(); i++) {
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    count++;
                }
            }
                if (count == 1) {
                    result += str.charAt(i);
                }
        }
        return result;
    }







}
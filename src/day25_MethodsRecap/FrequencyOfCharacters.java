package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AABBCC"; //A2B2C2
        String nonDup = Library.RemoveDuplicates(str);   //ABC


        String result ="";
        for(int i=0; i<nonDup.length(); i++) {

            String ch = "" + nonDup.charAt(i); // A"
            int num = Library.Frequency(str, ch);
            result +=ch+num;

        }


        System.out.println(result);

    }





    public static String FrequencyOfChars(String str){

        String nonDup = Library.RemoveDuplicates(str);
        String result ="";

        for(int i=0; i<nonDup.length(); i++) {

            String ch = "" + nonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result +=ch+num;

        }

        return result;
    }





}

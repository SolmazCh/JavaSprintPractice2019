package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {

    public static void main(String[] args) {

        // isEmpty();  checks if the String is empty, returns boolean

        String str1 = "      ";

         boolean r1 = str1.isEmpty(); //false
        boolean r2 = !str1.isEmpty(); // true

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("=============================================================");


       // equals(str): checks if the two string of texts are equal or not, return boolean

        // equalsIgnoreCase(str) checks if the two string of texts are equal or not (without case sensitivity), return boolean

        // == also check the location, but equals not

        String s1 = "cat";

        String s2 = new String("cat");

        String s3 = "Cat";

        System.out.println(s1==s2);  // false


        System.out.println(s1.equals(s2));  //true

        System.out.println(s1.equals(s3));  //false, case sensitivity

        System.out.println(s1.equalsIgnoreCase(s3)); //true, ignores case sensitivity;


        System.out.println("===============================================================");

       // contains(str): checks if the str is included in the string, returns boolean;

        String sentence = "I like to learn Java";

        System.out.println(sentence.contains("Java"));  // true


        String sentence2 = "Top 3 Viruses are: 1. Corona, 2. Hanta, 3. Ebola";

        System.out.println(sentence2.contains("Java"));  // false

        System.out.println("=========================================================");


        // startsWith(str): checks if the string started with given str, returns boolean


        //endsWith(str):checks if the string ended with given str, returns boolean

        String webAddress = "www.amazon.com";

        System.out.println(webAddress.startsWith("www"));  // true

       String gmail ="Cybertekschool@gmail.com";

        System.out.println(gmail.endsWith("@hotmail.com")); // false










    }
}

package day13_StringClass;

public class StringManipulation3 {

    public static void main(String[] args) {

        String str = "I like java programming john;";

        int num1 =  str.indexOf("john");
        System.out.println(num1);

    String str2 = "Cybertek school is awesome ";

    int firstS = str2.indexOf("s"); // 9

     int secondS = str2.indexOf("is")+1; //17

        System.out.println(firstS);

        System.out.println(secondS);

     int maxIndexnum = "Cybertek".length() -1 ; //8-1=7
        System.out.println(maxIndexnum);

        String names = "Muhtar";
         int a1  = names.indexOf("Good Guy");
        System.out.println(a1);

        String fullname = "Kuzzat Altay";

        String firstname = fullname.substring(0, fullname.indexOf(" "));

        String lastname = fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstname);

        System.out.println(lastname);













    }
}

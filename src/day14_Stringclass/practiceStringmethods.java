package day14_Stringclass;

public class practiceStringmethods {

    public static void main(String[] args) {


        String word = "Beautiful";

        char ch = word.charAt(3);
        System.out.println(ch);

        int length = word.length();
        System.out.println(length);

        String word2 = word.concat(" girl");

        System.out.println(word2);

        String lowc = word.toLowerCase();

        System.out.println(lowc);

        String upperc = word.toUpperCase();
        System.out.println(upperc);


        String sentence =  "             This girl is a pretty girl!";

        String s1 = sentence.trim();

        System.out.println(s1);


      String s2 = s1.substring(0);
        System.out.println(s2);

        String s3 = s1.substring(0, 5);

        System.out.println(s3);


        String replace = sentence.replace("pretty", "charming");

        System.out.println(replace);




        String ss = sentence.replaceFirst("This" , " ");

        System.out.println(ss);

        String car = "Lexus and Toyota";
        //            0123456789

             int a = car.indexOf("L");

        System.out.println(a);

            int b = car.lastIndexOf("Lexus");

        System.out.println(b);

            int c = car.lastIndexOf("lexus");
        System.out.println(c);

            String words = "hdj";

            String a3 = "Hdj";

        System.out.println(words.isEmpty()); //false


        System.out.println(words.equals(a3)); //false

        System.out.println(words.equalsIgnoreCase(a3));  //true

        boolean bl = words.contains("h");  //true

        System.out.println(bl);

        boolean bl1 = words.startsWith("q");   // false
        System.out.println(bl1);

        System.out.println(words.endsWith("t")); //false
















    }
}

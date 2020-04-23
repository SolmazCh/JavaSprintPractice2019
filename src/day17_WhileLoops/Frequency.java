package day17_WhileLoops;

public class Frequency {

    public static void main(String[] args) {

        String str = "JavaJava";

        int count = 0;

        String word = "Java";

        while (str.contains(word)) {
            count++;

            str = str.replaceFirst("Java", "");  // after counting the first "Java" we need to remove it from

        }
            System.out.println(count);

        System.out.println(str);





    }
}

package Replit_Solutions;

public class wordcount169 {
    public static int wordCount(String words) {

        String[] str = words.split(" ");

       int  wordCount = str.length;

        return wordCount;
    }


    public static void main(String[] args) {

        String s = "";

        int k =wordCount(s);

        System.out.println(k);
    }

}

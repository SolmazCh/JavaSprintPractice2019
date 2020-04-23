package RepeatStringTasks;

public class initialss {

    public static void main(String[] args) {

        String word1 = "soli";

        String word2 = "solmaz";

        String result = word1.substring(0,1).toUpperCase().concat(word2.substring(0,1).toUpperCase());


        System.out.println(result);

    }
}

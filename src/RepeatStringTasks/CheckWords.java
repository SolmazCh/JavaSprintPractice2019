package RepeatStringTasks;

public class CheckWords {

    public static void main(String[] args) {


        String word1 = "appa";

        String word2 = "banaa";

        String word3 = "peacaa";

        String result = "";

        if(word1.length()==word2.length() && word1.length()==word3.length()){
            result = "All words length are the same";
        }else if(word1.length() !=word2.length() && word2.length() != word3.length() && word1.length() != word3.length()){
            result ="All are different length";
        }else{
            result = "Not Same nor Different lengths";
        }

        System.out.println(result);



    }
}

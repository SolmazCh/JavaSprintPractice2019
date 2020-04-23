package RepeatStringTasks;

public class StartEndWords {

    public static void main(String[] args) {


        String word1 = "almaz";

        String word2 = "kolma";

        String result ="";

        if(word1.length() != 5 || word2.length() !=5){
            result = "need to be exactly 5 chars length";
        }else if(word1.substring(4).equals(word2.substring(0,1))){
            result = "Fizz";
        }else{
            result = "Buzz";
        }

        System.out.println(result);







    }
}

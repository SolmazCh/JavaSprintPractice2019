package RepeatStringTasks;

public class trueor {

    public static void main(String[] args) {

        String word = "abbaas";

       if(word.substring(0,1).equals(word.substring(word.length()-1 ) ) ){
           System.out.println("true");
       }else{
           System.out.println("false");
       }



    }
}

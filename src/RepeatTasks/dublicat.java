package RepeatTasks;

public class dublicat {

    public static void main(String[] args) {

String word = "AAAABBBkkkkkAAAAbbbbbbDDDDkkkkk";

String result="";


     for(int i=0; i<=word.length()-1; i++){

         if(result.contains(""+word.charAt(i))){
             continue;
         }

         result+=word.charAt(i);
     }


        System.out.println(result);













    }
}

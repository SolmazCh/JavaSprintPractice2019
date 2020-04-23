package day22_Arrays_Loops;

public class pythonandjava {
    /*
     3. write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
     */
    public static void main(String[] args) {


        String sentence = "I like learning Java and Python , Javascript is more fun than python .";

        int countJava =0;

        int countPython=0;

        String[] words = sentence.split(" ");

        for(String eachword : words){
            eachword.toLowerCase();

            if(eachword.contains("Java")){
                countJava++;
            }
            if(eachword.contains("python")){
                countPython++;
            }
        }

        System.out.println("count of Java: "+countJava);
        System.out.println("count of Python: "+countPython);

        System.out.println(countJava==countPython);  //true or false;








    }
}

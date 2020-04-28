package Replit_Solutions;

public class clean170 {
    public static String clean (String text ,String badWord) {

        if(text.contains(badWord)){
         text=   text.replace(badWord, "");
        }
        return text;
    }


    public static void main(String[] args) {




    }
}

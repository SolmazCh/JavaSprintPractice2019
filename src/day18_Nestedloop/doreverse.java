package day18_Nestedloop;

public class doreverse {
    public static void main(String[] args) {


        String word = "Java";

        String reverse ="";

        int lastIndex = word.length() - 1;


        do {



           reverse += word.charAt(lastIndex);

           lastIndex--;

       }while (lastIndex>=0);

        System.out.println(reverse);











    }
}

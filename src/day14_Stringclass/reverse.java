package day14_Stringclass;

public class reverse {

    public static void main(String[] args) {


        String word = "Java";

        word = ""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

        System.out.print(word);
    }
}

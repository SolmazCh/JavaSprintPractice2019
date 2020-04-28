package Replit_Solutions;

public class printvowels {

    public static void main(String[] args) {

        String word = "oopoo what idk what im doing";
        for(int i=0; i<word.length(); i++){
            String ch =""+word.charAt(i);

            if(ch.equals("a") || ch.equals("e") ||ch.equals("i" )||ch.equals("o") || ch.equals("u")){
                System.out.print(ch);
            }
        }
    }
}

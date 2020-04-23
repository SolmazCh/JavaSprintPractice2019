package day16_ForLoop;

public class abc2 {

    public static void main(String[] args) {

        String Capitalletters ="";
        String letters ="";
        String result ="";
        for(char ch = 'A'; ch<='Z'; ch++){
            Capitalletters+=ch+" ";
        }

        for(char ch2 = 'a'; ch2<='z'; ch2++){
            letters+=ch2+" ";
        }


        for(int i=0; i<Capitalletters.length(); i++) {

            result+= ""+Capitalletters.charAt(i) + letters.charAt(i);

        }
        System.out.println(result);

    }
}

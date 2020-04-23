package day16_ForLoop;

public class abc {

    public static void main(String[] args) {

        String upperCase = ""; // A~Z
        String lowercase = ""; // a~z

       for(char ch = 'A'; ch<='Z'; ch++){
           upperCase+=ch+" ";
       }

       for(char ch = 'a'; ch<='z'; ch++){
           lowercase+=ch+" ";
       }


        System.out.println(upperCase);

        System.out.println(lowercase);

     // Aa Bb Cc Dd.........

        String result ="";

        for(int i=0; i<= upperCase.length()-1 ; i++){

            result += upperCase.charAt(i)+""+ lowercase.charAt(i)+" ";

        }

        System.out.println(result);

       //second solution

        int a = 97;
        int A = 65;

        for(int i =0; i<26; i++){
            char ch = (char) (A + i);

            char ch1 = (char) (a + i);


         String  result2 = ch + "" +ch1 + " ";

         System.out.print(result2);


        }








    }
}

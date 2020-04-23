package day21_MultiDimensionalArrays;

public class Long_short_word {
    public static void main(String[] args) {

        String[] names ={"Omar", "Canan", "Muxtar", "Anna","Nahide","Muhammed"};

        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();

        String shortestWord ="";
        String longestword ="";
        for(int i=1; i<names.length; i++){

            if (names[i].length() > maxLengthString){
                maxLengthString = names[i].length();
                longestword = names[i];
            }

            if (names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }
        System.out.println(longestword);

        System.out.println(shortestWord);



    }
}

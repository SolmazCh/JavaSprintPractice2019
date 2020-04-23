package day21_MultiDimensionalArrays;

public class Longest_Shortest_words {
    /*
    2. write a program that can return the longest string of text from an array
	3. write a program that can return the shortest string of text from an array
     */

    public static void main(String[] args) {


        String[] str = {"day", "longest","me", "clean", "beautiful"};

        String max =str[0];

        String min =str[0];

        for(int i=0; i<str.length; i++){

            if(str[i].length()> max.length()){
                max=str[i];
            }

            if(str[i].length()<min.length()){
                min=str[i];
            }
        }

        System.out.println(max);
        System.out.println(min);





    }

}

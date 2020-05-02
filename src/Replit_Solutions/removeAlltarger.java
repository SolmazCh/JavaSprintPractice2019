package Replit_Solutions;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAlltarger {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hi","hey","hi","yo"));

        String targetWord ="hi";

        for(int i=0; i<wordList.size(); i++){
            if(wordList.get(i).equals(targetWord)){
                wordList.remove(wordList.get(i));
            }
        }


        System.out.println(wordList);


    }
}

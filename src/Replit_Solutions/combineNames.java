package Replit_Solutions;

import java.util.Arrays;

public class combineNames {

    public static void main(String[] args) {

        String[] names ={"Aysel","Turkan","Solmaz"};

        String[] lastNames ={"Abbasova","Jafarova","Chiragova"};

        String[] result = new String[names.length];

        for(int i=0; i<names.length; i++){
            result[i] = names[i]+" "+lastNames[i];
        }
        System.out.println(Arrays.toString(result));




    }
}

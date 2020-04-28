package Replit_Solutions;

public class coverme168 {
    public static void main(String[] args) {

        String main = "java methods";
        String coverMe = "me";

        String result = coverString(main,coverMe);

        System.out.println(result);
    }


    public static String coverString(String main, String coverMe) {

        String result = main.replaceAll(coverMe, "[" + coverMe + "]");


        for (int i = 0; i < main.length(); i++) {
            if (main.contains(coverMe)) {
                return result;
            }
        }
        return main;

    }






}

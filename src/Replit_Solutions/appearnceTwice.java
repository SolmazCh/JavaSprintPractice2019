package Replit_Solutions;


public class appearnceTwice {


    public static boolean appearsTwice(String target, String sentence) {


        return false;
    }

    public static void main(String[] args) {

        String target ="java";
        String sentence ="java is fun java";

        int count =0;

        while(sentence.contains(target)){
            count++;
            sentence=sentence.replaceFirst(target,"");
        }

        if(count==2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}


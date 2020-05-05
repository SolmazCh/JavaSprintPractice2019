package Practice_HardTasks;

public class abc {

    public static void main(String[] args) {

        String capital ="";
        String letter ="";
        String result ="";

        for(char ch='A'; ch<='Z'; ch++){
            capital+=ch+" ";
        }

        for(char ch='a'; ch<='z'; ch++){
            letter+=ch+" ";
        }


        for(int i=0; i<letter.length(); i++){
            result+=capital.charAt(i)+""+letter.charAt(i);
        }

        System.out.println(result);



    }
}

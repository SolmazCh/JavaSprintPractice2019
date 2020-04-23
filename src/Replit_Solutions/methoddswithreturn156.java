package Replit_Solutions;

public class methoddswithreturn156 {


    public static int count_appearance(String[] arr, String t) {
        int count_appearance = 0;

        for (String each : arr) {

            if (each.contains(t) && each.length()==t.length()) {
                count_appearance++;
            }
        }


        return count_appearance;

    } //end  count_appearance


    public static void main(String[] args){

        String[] str ={"a","foo","bar","foo","bla"};

        String s ="a";

        int k = count_appearance(str,s);

        System.out.println(k);
}


}
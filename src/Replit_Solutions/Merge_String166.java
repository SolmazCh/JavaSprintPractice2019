package Replit_Solutions;

public class Merge_String166 {

    public static void main(String[] args) {
        String one ="123";
        String two="abc";

        String result = mergeStrings(one,two);

        System.out.println(result);
    }

    public static String mergeStrings(String one, String two) {
            String result ="";
            if(one.length()>two.length()){
                for(int i=0; i<two.length(); i++) {
                    result += "" + one.charAt(i) + two.charAt(i);
                }
                    result+=one.substring(two.length());

            }else{
                for(int i=0; i<one.length(); i++) {
                    result += "" + one.charAt(i) + two.charAt(i);
                }
                    result+=two.substring(one.length());

            }


            return result;
        }




    }






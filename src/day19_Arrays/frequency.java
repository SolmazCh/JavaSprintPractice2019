package day19_Arrays;

public class frequency {

    public static void main(String[] args) {


        String str = "AABCC";  // A2B1C2
        String result =""; // A2B1C2

        String nonDup =""; // ABC


        for(int i=0; i<str.length(); i++){
            if(!nonDup.contains(""+str.charAt(i)) ){ // if the character at index i is not contained in nonDup, then it will be containing
                nonDup+=str.charAt(i);
            }
        }



        //nonDup="ABC"  str="AABCC  ==> result="A2B1C2"


        for(int j=0; j<nonDup.length(); j++) {

               int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }

            result += "" + nonDup.charAt(j) + count;
        }


        System.out.println(result);













    }


}

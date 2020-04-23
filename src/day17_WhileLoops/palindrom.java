package day17_WhileLoops;

public class palindrom {
    public static void main(String[] args) {

        String str = "Javaj";

        String reversestr =""; // store the reversed version of str

     int index =   str.length()-1;  // last index number

        while (index>=0){
         reversestr+= str.charAt(index);
            index--;
        }

       boolean palindrome =reversestr.equalsIgnoreCase(str);

        System.out.println(palindrome);

    }
}

package Replit_Solutions;

public class palindrome194 {

    public static boolean isPalindrome(String check) {

        String reverse ="";

        check = check.replaceAll(" ", "");

        for(int i=check.length()-1; i>=0; i--){
            reverse+=""+check.charAt(i);
        }



        if(reverse.equalsIgnoreCase(check)){
            return true;
        }
            return false;
    }


    public static void main(String[] args) {
        String str = "Nurses run";

        boolean palindrom = isPalindrome(str);

        System.out.println(palindrom);
    }




}

package codingBat;

public class missingChar {
    public static void main(String[] args) {

/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 The value of n will be a valid index of a char in the original string

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */
          String str ="kitten";
          int n=1;
          str=str.replace(str.charAt(n)+"","");

           System.out.println(str);

    }
}

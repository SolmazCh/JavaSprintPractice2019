package Replit_Solutions;

import java.util.Scanner;

public class Sandwich_Loop {
/*
A sandwich is two pieces of bread with something in between.
 Print the string that is between the first and last appearance of "bread" in the given string,
 or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int numbread=0;




        for (int i=0;i<str.length()-4;i++){
            if (str.substring(i,i+5).equalsIgnoreCase("bread")){
                numbread++; } }
        if (numbread>=2){
            System.out.println(str.substring(str.indexOf("d")+1,str.lastIndexOf("bread")));
        }
        else {
            System.out.println("nothing");
        }



        }
}

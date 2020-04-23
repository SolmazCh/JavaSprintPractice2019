package day14_Stringclass;

public class webaddress {

    public static void main(String[] args) {

         /*
         write a program that can validate if a web address is valid

                   valid web address:
                   MUST start with www.
                   Must ends with .com or .edu , or .net or .gov


          */



        String website = "WWW.cybertek.Gov";

                website = website.toLowerCase();

                boolean validEnding = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov")|| website.endsWith(".net");


                if(website.startsWith("www.") && validEnding){

                    System.out.println("Valid address");

                }else{
                    System.out.println("Invalid Address");
                }















    }
}

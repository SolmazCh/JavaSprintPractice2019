package day14_Stringclass;

public class practice {

    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";


        String userinputGmail = "CybertekSchool@gmail.com";

      boolean result =  userinputGmail.equalsIgnoreCase(gmail);  // false


        if(result){
            System.out.println("Logged in");
        }

        System.out.println("==========================================================================");

         /*
         valid password MUST contain a special characters such as(!, _, $)
         valid password should not contain spaces
          */

         String Password = "mmasd 1235";

         if(Password.contains(" ")){
             System.out.println("Password can not have space in it");
         }else{
             System.out.println("valid password");
         }


        System.out.println( "===================================================================" );


         /*
        every website has "http" at the beginning of address
          */


         String webAddress = "Www.amazon.com";

         webAddress = webAddress.toLowerCase();

         if(webAddress.startsWith("www.")){
             System.out.println("valid");
         }else{
             System.out.println("invalid");
         }

        System.out.println("========================================================================");

         /*
         every single gmail address ends with @gmail.com
          */

         String email = "CybertekSchool@Yahoo.com";

         if(email.endsWith("@gmail.com")){
             System.out.println("valid gmail");
         }else{
             System.out.println("Invalid gmail");
         }

        System.out.println("=================================================");

         /*
         write a program that can validate if a web address is valid

                   valid web address:
                   MUST start with www.
                   Must ends with .com or .edu , or .net or .gov


          */



         String webaddress = "www.youtube.com";

         if(!(webAddress.startsWith("www.") && webAddress.endsWith(".com") || webAddress.startsWith("www.") && webAddress.endsWith(".edu") ) ){
             System.out.println("Invalid entry");
         }











    }
}

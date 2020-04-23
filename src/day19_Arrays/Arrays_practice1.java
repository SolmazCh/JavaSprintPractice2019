package day19_Arrays;

public class Arrays_practice1 {

    public static void main(String[] args) {

        String[]  myClassmates ={"Nahide" , "Fayssal","Volkan", "Arzu", "Muhammed", "Serhat", "Misem", "Harun"};

        String name1 = myClassmates[0];

        System.out.println(name1);


      for( int i=0; i<=6; i++){

         String name = myClassmates[i];
          System.out.println(name);
      }

        System.out.println("=========================================================");


      String[] USPresidents ={"Barak Obama", "Corc Bush", "Trump", "Washington", "Abraam Lincoln"};


      for(int i=0; i<=4; i++) {

          String president = USPresidents[i];

          System.out.println(president);

      }

        System.out.println("*********************************************************");

      String[] emails = {"cybertek@gmail.com", "cybertek@yahoo.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

      for(int i=0; i<=3; i++) {

          String email = emails[i];

          if (email.endsWith("@gmail.com")) {
              System.out.println(email);

          }

      }






    }
}

package Quiz_Practice;

public class Quiz_questions3 {
    public static void main(String[] args) {

      /*  long a =3_000L; // = 3000L;
       // long c = 56_5467879L;
        System.out.println(a);
       // System.out.println(c);
        //double b =(float)c;
        System.out.println();
      //  System.out.println(c);
        int d = (short) b;
        System.out.println(d % 1000);
*/
      long a = 3_000L; // =3000
      double b =(float)a; // = 3000
      int c =(short)b; // 3000
        System.out.println(c%1000); // 3000/1000=0 remain
//==========================================================


        System.out.println(10/3); // 3 yeni qaligi gostermir
        System.out.println(10/3.0); // 3.33333333 qaliqla birlikde gosterir
        System.out.println(10.0/3.0); // 3.333333333 qaliqla bir gosterir
        System.out.println((int)(10.0/3)); // (int) 3.333333 = 3
        //==========================================================


        String str ="10.5"+3;
        //int num = (int) str; int yazi ola bilmez yalniz reqem ola biler

        //System.out.println(num); compilation fail

        //========================================================

        int x = 10;
        int y = x++;
        System.out.println(y++ + " "+x++ + " "+y); // 10++ + 11++ +11= 10 11 11









    }
}

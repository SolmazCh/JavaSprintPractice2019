package day05_Unary_ShirthandOperators;

public class postPre_Practise {

    public static void main(String[] args) {

       int a =50; //49
       a = --a + a++ + a-- + a++;
        // 49 +49 + 50 +49 = 197;
        System.out.println(a);





        int x = 4;
        int y = x*4 - x++;


        int b =1;
        b= -b-- + b++ / -b-- * --b;

        //b = -1 + 0 / -1 * -1
        // -1+0* -1
        // -1+0 = -1
        System.out.println(b);



        // a++ = 1;  -a-- = -2 ;  1/(-2)= -0,5; -0,5 * -1,5 = 0,75;





    }



}

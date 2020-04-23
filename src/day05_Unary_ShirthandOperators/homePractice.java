package day05_Unary_ShirthandOperators;

public class homePractice {

    public static void main(String[] args) {

     int   x=2;
      int  y = x++;
        // 2; 3
        System.out.println(y);


        int a = 1;
        int b = -a-- + a++ /-a-- * --a;
        // a= -1 + 0 / -1 *(-1)
        //a = -1 +0=-1
        System.out.println(b);



        int c = 50;
        c=--c +c++ +c-- + c++;
        // c= 49 +49+ 50 + 49 =197;
        System.out.println(c);

    int f =4;
    int z = f *4 -f++;
    //z= 4*4 -4=12;
        System.out.println(z);


        System.out.println((int)(10/3.0));

        System.out.println("Result"+1+2);
        System.out.println("result"+(1)+(2));
        System.out.println("5+2="+2+4);
        System.out.println("5+2="+(2+4));
        float    a2  =  100.987_6543f;
        short  b3 =  (byte) a2 ;
        byte  c5  = (byte) b3;
        System.out.println(c5);


        System.out.println(14.0/3);













    }










}

package OfficeHours.Practice_03_18_2020;

public class ShortHandOperators_Practice {


    public static void main(String[] args) {

        //+=; addition assignment;
        int a = 100;
        a = a+200;
        System.out.println(a);
        a+=200;
        System.out.println(a);
        a+=a*3;
        System.out.println(a); // a=2000

        // -= subtraction assignment;
        a=a-400;
        a-=400; //1200
        System.out.println(a);

        int b = 300;
        b-= 3*40; // 300-120=180;
        System.out.println(b);
        // *= multiplication assignment;

        int x =5;
      //  x=x*3; //15
        x*=3;
        System.out.println(x);
        x*=2+1; // x*=3== x=x*3 // x=x*(2+1)
        System.out.println(x);

       // /= division assignment;

        int n =900;
      //n =  n/3;
        n/=3;
        System.out.println(n);

        n/=3*5; // n=n/15==>20
        System.out.println(n);

        int m = 10;
       // m= m%3; //1
        m%=3;
        System.out.println(m);

        int y = 300;
        y%= 3*5; //300%15=0
        System.out.println(y);

        int t = 400;
        t%=10*2; //400%20=0
        System.out.println(t);























    }
}

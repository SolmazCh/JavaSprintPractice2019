package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {

    public static void main(String[] args) {


        int x =20;

        x += 10; // x=x+10=20+10=30
        System.out.println(x); //30

        x+=60; //90
        System.out.println(x);

        String schoolname ="Cybertek";
        schoolname +=12345; // schoolname = schoolname+12345
        System.out.println(schoolname);

        System.out.println('a'+'b');//97+98=195


        char ch1 = 'a';//97
             ch1 += 'b';//98
        // char ch1 =195 = character from tablet = Ã
        System.out.println(ch1); //character


        int num = 'z'; // num=122
        num+= 'x'; // num = num+120;
                       // num = 122+120=242
        System.out.println(num);

        int A =100;
        A-= 90;  //10
        System.out.println(A);
         int B = 200;
         B -= A; // B=B-A=200-10=190

        int a=2;
        a*=3;
        System.out.println(a); //6

        int b =a*10; //60 a=6 6*10=60
        System.out.println(b);
        System.out.println(a);

        int a1 = 100;
        int b1 = (a1*=2) + ++a1;
        // b1= 100*2 + 201= 200+201=401
        System.out.println(b1);

        int x1=10;
        int y = x1+=10*2; // x1 = x1+20
             // x1 +=20 ==>30
        System.out.println(y);

        int q =20;
        int p = q*=20*3;
        // q*=60;  // q= q*60= 20*60=1200
        System.out.println(p);

         int num1 =6;
          num1/=2; // num1=num1/2= 6/2=3
        System.out.println(num1);

        int num2 = 400;
        num2/= 20+10; // num2 = num2/30= 400/30;
        System.out.println(num2);


        int num3 =300;
        num %= 10+20; // num= num%30= 300%30=0

        int n1 = 400;
        n1%=3*5; // n1=n1%15=400%15
        System.out.println(n1);


















    }


}

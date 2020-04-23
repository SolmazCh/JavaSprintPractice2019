package OfficeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {

    public static void main(String[] args) {

        int a= 20;
        System.out.println(a++);//20
        System.out.println(a); //21


        int b = 30;
        int c = b--; // 30
        // after this b==29
        System.out.println(c);
        System.out.println(b);
        System.out.println(c);



        int d = 40;
        int e = d++; // e=40 d=41
        System.out.println(d);
        System.out.println(e);


        int z = 100;
        z = z++ + --z + - z-- + ++z;
        // z= 100 + 100 + - 100 + 100 = 200;
        System.out.println(z);

        int u = 900;
        int r = - ++u + ++u + -u++;
        // - 901 + 902 + - 902 = -901 + 902-902= -901
        System.out.println(r);











    }
}

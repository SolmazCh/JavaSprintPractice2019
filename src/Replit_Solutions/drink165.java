package Replit_Solutions;

public class drink165 {

    public static void main(String[] args) {

        boolean available=false;
        boolean gift =false;

        int ingredient1=3;
        int ingredient2=1;
        int ingredient3=5;


      boolean bl = ingredient1>0 && ingredient1<4 && ingredient2>0 && ingredient2<4 && ingredient3>0 && ingredient3<4;

        boolean bl2 = ingredient1 !=ingredient2 && ingredient2 !=ingredient3 && ingredient3 != ingredient1;


        if(available==true || gift==true || bl==true && bl2==true ){
            System.out.println(true);
        }else{
            System.out.println(false);
        }













    }

}
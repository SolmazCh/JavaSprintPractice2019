package OfficeHours.Practice_05_13_2020;

public class StaticBlock {
    static String str;
    //    str = str.toUpperCase();

    static {
        str = "Cybertek";
        str = str.toUpperCase();
        str="Harvard";
        str="MIT";

    }
}



    class staticBlockTest {
        public static void main(String[] args) {

            System.out.println(StaticBlock.str);
        }
    }


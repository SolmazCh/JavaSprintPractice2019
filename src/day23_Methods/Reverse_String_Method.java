package day23_Methods;

public class Reverse_String_Method {

    public static void main(String[] args) {

        String name1 = "Solmaz";
        reverseString(name1);

        String name2 ="Cybertek School";
        reverseString(name2);
    }

    public static void reverseString(String str){

        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }










}

package day39_AccessModifiers;

public class Test {
    public static void main(String[] args) {

        AccesModifiers obj1 = new AccesModifiers();
        System.out.println(obj1.defaultAccess);
        System.out.println(obj1.publicAccess);
       // System.out.println(obj1.SSN); SSN is private, you can not call anywhere outside the class


    }
}

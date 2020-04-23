package day13_StringClass;

public class String_concat {

    public static void main(String[] args) {

        String fullname = "Solmaz Chiragova";

        String about = fullname.concat(", works as a QA engineer in VISA");
        System.out.println(about);


        String salary = about.concat(", she earns 55$ per hour.");

        System.out.println(salary);

        String str = "Tell me about yourself.";

        String str2 = str.concat(" What is your favorite book, what is your hobby?");

        System.out.println(str2);






    }
}

package day12_JavaRecap;

public class TernaryPractice2 {

    public static void main(String[] args) {

    char chr = 'h';

    String result = " ";

    switch (chr) {

        case 'A':
            result = "A is selected";
            break;
        case 'B':
            result = "B is selected";
            break;
        case 'C':
            result = "C is selected";
            break;
        case 'D':
            result = "D is selected";
            break;
        case 'E':
            result = "E is selected";
            break;
        default:
            result = "Saying not found";

    }


            System.out.println(result);

         String result2 = (chr == 'A') ? "A is selected" : (chr == 'B') ? "B is selected": (chr == 'C') ? "C is selected"
                 : (chr == 'D') ? "D is selected" : (chr == 'E') ? "E is selected" : "Invalid Character" ;


        System.out.println(result2);







    }












}

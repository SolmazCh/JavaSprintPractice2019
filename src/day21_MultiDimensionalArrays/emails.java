package day21_MultiDimensionalArrays;

public class emails {

    /*  given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP*/

    public static void main(String[] args) {


        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String eachmail : emails){

            if(eachmail.endsWith("@gmail.com")){
                continue;
            }

            System.out.println(eachmail);
        }


    }
}

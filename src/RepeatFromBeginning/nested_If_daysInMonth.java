package RepeatFromBeginning;

public class nested_If_daysInMonth {

    public static void main(String[] args) {

        int num = 8;

        String month = "";

        if(num>0 && num<13){

            if(num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num ==12){

                month = "31 days";

            }else if( num == 2){

                month = "28 or 29 days";
            }else {
                month = " 30 days";
            }

        } else{
            month = "invalid number";
        }


        System.out.println(month);







    }
}

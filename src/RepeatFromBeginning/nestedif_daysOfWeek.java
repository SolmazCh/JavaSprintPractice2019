package RepeatFromBeginning;

public class nestedif_daysOfWeek {

    public static void main(String[] args) {

        int num = 50;

        String day = "";

        if(num>0 && num<8){

            if(num == 1){
                day = "Monday";

            }else if(num == 2){
                day = "Tuesday";
            }else if(num == 3){
                day = "Wednesday";
            }else if(num == 4){
                day = "Thursday";
            }else if(num == 5){
                day = "Friday";
            }else if(num == 6){
                day = "Saturday";
            }else{
                day = "Sunday";
            }
        }else{
            day = "Invalid number";
        }


        System.out.println(day);







    }
}

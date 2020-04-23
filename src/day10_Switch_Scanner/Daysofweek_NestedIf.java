package day10_Switch_Scanner;

public class Daysofweek_NestedIf {
    public static void main(String[] args) {

        // task1
        // 2. write a program that can display the days based on the numbers 1 ~ 7

        byte day =5;
        String dayofweek = " ";
        if(day>0 && day<8) {

            dayofweek = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday"
                    : (day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday"
                    : "Sunday" ;

        }else{
            dayofweek = "Invalid";
        }


        System.out.println(dayofweek);
        System.out.println("===========================================================================");



             int number = 3;
             String result = "";

             if(number>0 && number<8) {


                 if (number == 1) {
                     result = "Monday";
                 } else if (number == 2) {
                     result = "Tuesday";
                 } else if (number == 3) {
                     result = "Wednesday";
                 } else if (number == 4) {
                     result = "Thursday";
                 } else if (number == 5) {
                     result = "Friday";
                 } else if (number == 6) {
                     result = "Saturday";
                 } else {
                     result = "Sunday";
                 }
             } else {
                 result = "Invalid";
             }

        System.out.println(result);
        System.out.println("==============================================================");















         //task2
        /*3. write a java program that can convert numbers between 0 ~ 9 to words,
        if the number is greater than 9 or less than zero, out put should be "Invalid".

         */

            byte num = 5;

            String words = " ";


                words = (num==1) ? "Beautiful" : (num==2) ? "Charming" : (num==3) ? "Attractive"
                        : (num==4) ? "Pretty" : (num==5) ? "Colorful" : (num==6) ? "Energetic"
                        : (num==7) ? "Wonderful" : (num==8) ? "Amazing" : "Invalid" ;




        System.out.println(words);
        System.out.println("===============================================================================");

       //task3

        /*
        4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)

		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12


         */

           byte month = 20;
            String days= " ";

            if(month>0 && month<=12){
                days = (month==1) ? "31 days" : (month==2) ? "28 days" : (month==3) ? "31 days"
                        : (month==4) ? "30 days" : (month==5) ? "31 days" : (month==6) ? "30 days"
                        : (month==7) ? "31 days" : (month==8) ? "31 days" : (month==9) ? "30 days"
                        : (month==10) ? "31 days" : (month ==11) ? "30 days" : "31 days";

            }else{
                System.out.println("Invalid entry");
            }


                  System.out.println(days);
        System.out.println("===========================================================================");
                 //another way


                int num1 = 12;

                 boolean days28 = num1 ==2;
                 boolean day30 = num1 == 4 || num1==6 || num==9 || num==11;

                 String result1 = "";

                 if(num1>0 && num1<13){

                     result1 = (days28) ? "Has 28 days" : (day30) ? "Has 30 days" : "Has 31 days";



                 }else{
                     result1 = "Invalid";
                 }


        System.out.println(result1);
        System.out.println("==================================================================");








    }
}

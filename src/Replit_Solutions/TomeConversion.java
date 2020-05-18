package Replit_Solutions;

import java.util.Scanner;

public class TomeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        if (s.contains("AM")) {
            System.out.println(s.substring(0, s.length()-2));
        }else if (s.length()==10){

            int ch1 = Integer.valueOf(s.substring(0, 1));
            ch1 +=1;
            int ch2 = Integer.valueOf(s.substring(1, 2));
            ch2 +=2;
            s=ch1+"" +ch2+s.substring(2, s.length()-2);
            System.out.println(s);
        }else {

            int ch2 = Integer.valueOf(s.substring(0, 1));
            ch2 +=12;
            s="" +ch2+s.substring(1, s.length()-2);
            System.out.println(s);

        }

        System.out.println("=============================================================");

        String time[] = s.split(":");
        String hour = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0, 2);
        String ampm = time[2].substring(2, 4);
        if(ampm.equals("AM")){
            if(hour.equals("12"))
                hour="00";
            System.out.println(hour+":"+minutes+":"+seconds);
        }else{
            if(!hour.equals("12")){
                int hour1 = Integer.parseInt(hour);
                hour1 = hour1+12;
                hour =""+hour1;
            }
            System.out.println(hour+":"+minutes+":"+seconds);
        }






    }
}

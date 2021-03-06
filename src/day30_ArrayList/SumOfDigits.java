package day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {
       public static void main(String[] args) {

      /*
      1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits

       */
        String str = "a1b2c3";
        char[] arr=str.toCharArray();

        int sum =0;
        String alphabet ="";
        for(char each: arr) {
            /*   if(each>=48 && each<=57){  // from ascii table, finds if each is digit(means number from 0-9)
              sum+=Integer.parseInt(each+"");
            }
         */
            if (Character.isDigit(each)) {
                sum += Integer.parseInt(each + "");
            } else if (Character.isAlphabetic(each)) {
                alphabet += each + "";

            }
        }
           System.out.println(sum);
           System.out.println(alphabet);




    }
}

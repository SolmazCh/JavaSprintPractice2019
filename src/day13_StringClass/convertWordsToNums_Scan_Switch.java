package day13_StringClass;

import java.util.Scanner;

public class convertWordsToNums_Scan_Switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 0~9:");

        byte num = scan.nextByte();

        String word = "";

        switch(num){

            case 0:
              word = "Zero";
              break;

            case 1:
                word = "One";
                break;

            case 2:
                word = "Two";
                break;

            case 3:
                word = "Three";
                break;

            case 4:
                word = "Four";
                break;

            case 5:
                word = "Five";
                break;

            case 6:
                word = "Six";
                break;

            case 7:
                word = "Seven";
                break;

            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;

            default:
                word = "Invalid";

        }

        System.out.println(word);




       String result = (num ==0)? "Zero" : (num==1)? "One": (num==2)? "Two": (num==3)? "Three":
               (num==4)? "Four": (num==5)? "Five": (num==6)? "Six": (num==7) ? "Seven":
                       (num==8)? "Eight": (num==9)? "Nine": "Invalid number";
        System.out.println(result);





    }
}

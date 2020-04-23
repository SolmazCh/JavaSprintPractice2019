package day11_Scanner;

public class browserName {

    public static void main(String[] args) {

        String browserName = "chrome";

        switch (browserName){
            case "Chrome":
            case "chrome":
                System.out.println("chrome is opening...");
                break;
            case "Firefox":
            case "firefox":
                System.out.println("firefox is opening...");
             break;
            case "Opera":
            case "opera":
                System.out.println("opera is opening...");
             break;
            case "Safari":
            case "safari":
                System.out.println("safari is opening");
             break;

            default:
                System.out.println("Invalid Browser Name, Please give the right browser name");



        }


    }
}

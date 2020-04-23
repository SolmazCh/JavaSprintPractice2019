package day25_MethodsRecap;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "ie", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */

import javax.crypto.spec.PSource;

public class Driver {

    public static String getDriver1(String browserName) {


        switch (browserName.toLowerCase()) {

            case "chrome":
                return "Chrome Driver";
            case "firefox":
                return "Firefox Driver";
            case "safari":
                return "Safari Driver";
            case "edge":
                return "Edge Driver";
            case "opera":
                return "Opera Driver";
            default:
                return "Invalid Driver";
        }
    }

    public static String getDriver2(String  browserName){
        browserName =browserName.toLowerCase();


        if(browserName.equals("chrome")){
            return  "Chrome Driver";
        }else if(browserName.equals("firefox")){
           return  "Firefox Driver";
        }else if (browserName.equals("safari")){
           return  "Safari Driver";
        }else if(browserName.equals("edge")){
            return "Edge Driver";
        }else if (browserName.equals("opera")){
           return  "Opera Driver";
        }
            return "Invalid";
        }


    public  static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome")) ? "Chrome Driver" :
                        (browserName.equals("firefox")) ? "Firefox Driver" :
                         (browserName.equals("safari")) ? "Safari Driver":
                        (browserName.equals("edge")) ? "Edge Driver":
                         (browserName.equals("opera"))? "Opera Driver": "Invalid Driver";

             return result;

    }


    public static void main(String[] args) {

        String str1 = getDriver1("Cybertek");

        System.out.println(str1);

        String str2 =getDriver2("CHrome");

        System.out.println(str2);

        String str3 = getDriver3("edgE");

        System.out.println(str3);
    }






}

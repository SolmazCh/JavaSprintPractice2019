package Resources;

import java.util.Arrays;

public class Library {

    public static int[] sortDescending(int[] arr) {
        Arrays.sort(arr);

        int[] RevArr = new int[arr.length];

        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            RevArr[j] = arr[i];
            j++;
        }
        return RevArr;
    }


    public static String Reverse2(String str) {
        String Reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        return Reverse;
    }


    public static  int maxNum(int[] max){
        Arrays.sort(max);

        return max[max.length-1];
    }


    public static String minNUm(int[] min){

        Arrays.sort(min);

        String result = "Minimum number is: "+min[0];

        return result;
    }


    public  static String RemoveDuplicates(String str){

        String result ="";    //AB

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }


    public static String unique(String str){

        String result ="";


        for(int k=0; k<str.length(); k++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(k)) {
                    count++;
                }
            }

            if (count == 1) {
                result += str.charAt(k);
            }

        }
        return result;
        }


    public static String frequency(String str){

        String result ="";

        String nonDup ="";


        for(int i=0; i<str.length(); i++){

            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }


        for(int j=0; j<nonDup.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                } }

            result += "" + nonDup.charAt(j) + count;

        }
        return result;
        }


    public static String combineTwoArrays(int[] arr1, int[] arr2){


        int[] arr3 =new int[arr1.length+arr2.length];


        for(int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }

        for(int i=0; i<arr2.length; i++){
            arr3[arr1.length+i] = arr2[i];
        }

        return  Arrays.toString(arr3);
    }


    public static int Frequency(String str1, String str2){

        int count =0;

        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make sure that we are not counting the same index over again
        }

        return count;

    }

    public static int frequency(String str, char ch){
        char[] arr =  str.toCharArray();  // [A,A,A]
        int count =0;
        for( char each: arr){
            if(each==ch){
                count++;
            }
        }
        return count;
    }

    public static String FrequencyOfChars(String str){

        String nonDup = Library.RemoveDuplicates(str);
        String result ="";

        for(int i=0; i<nonDup.length(); i++) {

            String ch = "" + nonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result +=ch+num;

        }

        return result;
    }



    }

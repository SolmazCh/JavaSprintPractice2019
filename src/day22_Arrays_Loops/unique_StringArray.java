package day22_Arrays_Loops;

public class unique_StringArray {
    /*
    Write a program that can print out the unique values from  String Array
     */

    public static void main(String[] args) {


        String[] str = {"Java", "C++", "Java", "Python", "C++"};


        for(int k=0; k<str.length; k++){

            int count=0;

            for(int i=0; i<str.length; i++) {

                if (str[i] == str[k]) {
                    count++;
                }

            }
                if(count==1){
                    System.out.println(str[k]);

            }
        }



    }
}

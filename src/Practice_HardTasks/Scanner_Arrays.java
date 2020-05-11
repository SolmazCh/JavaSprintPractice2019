package Practice_HardTasks;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Arrays {
    /*
1. Write a program that will take five Strings and save them into an array called arr.
2. use for each loop to print out the first three letter of each element of arr, one per line.
        You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
 */

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] arr = new String[5];
        System.out.println("Enter five words");

        for(int i=0; i<5; i++){
            arr[i]=scan.next();
        }

        for(String each: arr){
            System.out.println(each.substring(0,3));
        }



    }
}

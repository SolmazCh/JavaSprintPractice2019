package Replit_Solutions;

import java.util.Scanner;

public class printunique153 {

          public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            String[] words = new String[size];
            for(int i=0; i < size; i++){
                words[i] = scan.next();
            }
            printUniqueWords(words);
        }

        public static void printUniqueWords(String[] words){
            //WRITE YOUR CODE HERE java
            //code
            //python
            //code
            //rust
            //code
            //rust

            String result ="";
            for(String each : words){
                int count=0;

                for(int i=0; i<words.length; i++) {
                    if (each == words[i]) {
                        count++;
                        words[i] = words[i].replaceFirst(each, "");
                    }
                }

                if(count==1){
                    result+=each+"\n";
                }
            }
            System.out.println(result);

        }
    }


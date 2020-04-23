package Replit_Solutions;

import java.util.Scanner;

public class split_methods146 {




        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            String s = inp.next();
            person(s) ;
        }

        public static void person(String info)
        {

            //your code here

            String[] words = info.split(",");

            String name = words[0];

            String lastname = words[1];

            String age = words[2];

            System.out.println("person name: "+name+" last name: "+lastname+" age: "+age);



        }//end person

    }


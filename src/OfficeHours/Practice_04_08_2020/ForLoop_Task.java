package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {

    public static void main(String[] args) {

        for(int i=0; i<100; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
            System.out.println();

        System.out.println("==============================");


        String name = "";
                     //012345

        String result ="";

        int lastIndex = name.length()-1;


        for(int i=lastIndex; i>=0; i--){

        // result+= name.charAt(i);

         result+=name.substring(i,i+1);
        }                     // 3, 4 ==> a
                             //  2,3 ==>n
                              // 1,2 ==> n
                              // 0,1 ==> A



        System.out.println(result);

        if(!name.isEmpty()) {
            if (name.equalsIgnoreCase(result)) {
                System.out.println(name + " is palindrome name");
            } else {
                System.out.println(name + " is not a palindrome name ");
            }
        }else{
            System.out.println("Name is empty");
        }



    }
}

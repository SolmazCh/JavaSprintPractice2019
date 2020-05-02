package Replit_Solutions;

import java.util.ArrayList;

public class repeattwice {
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr){

        ArrayList<Integer> twoTimes = new ArrayList<>();

        for(int i=0; i<arr.size(); i++){
            twoTimes.add(i+1);
            twoTimes.add(i+1);
        }

        return twoTimes;


    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        ArrayList<Integer> twoTimes = new ArrayList<>();

        for(int i=0; i<arr.size(); i++){
            twoTimes.add(i+1);
            twoTimes.add(i+1);
        }







    }
}

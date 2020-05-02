package Replit_Solutions;

import java.util.ArrayList;

public class combineArray {

    public static ArrayList<String> combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2){


    ArrayList <String> combineAll = new ArrayList<>();

	for(String each1:wordList1){
        combineAll.add(each1);
    }

	for(String each2:wordList2){
        combineAll.add(each2);
    }
	return combineAll;
}

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("k");
        arr1.add("d");
        ArrayList<String> arr2 = new ArrayList<>();
          arr2.add("g");
          arr2.add("l");

          ArrayList<String> combineall = new  ArrayList<>();

          combineall = combineAl(arr1,arr2);
        System.out.println(combineall);
    }



}

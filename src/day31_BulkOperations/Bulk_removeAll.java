package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        String[] names ={"Muxtar","Solmaz","Solmaz","Davud","Saim","Asiya"};

        list.addAll(Arrays.asList(names));

        ArrayList<String> nonDup = new ArrayList<>();


        for(int i=0; i<list.size(); i++) {
            if (!nonDup.contains(list.get(i))){
                nonDup.add(list.get(i));
            }
        }

        System.out.println(nonDup);

    }
}

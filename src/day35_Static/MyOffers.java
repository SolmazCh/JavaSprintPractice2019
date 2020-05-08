package day35_Static;

import com.sun.istack.internal.ByteArrayDataSource;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer[] offers = {new Offer(), new Offer(), new Offer(), new Offer(), new Offer(),};

        offers[0].setOfferInfo("Fairfax", "Indeed", 120000,true);
        offers[1].setOfferInfo("Chantilly", "P&S company", 75000,false);
        offers[2].setOfferInfo("MC Lean", "Amazon", 135_000,true);
        offers[3].setOfferInfo("Reston","Cybertek",45000,false);
        offers[4].setOfferInfo("Springfield","Master Card", 125_000,true);

        ArrayList<Offer> myOffers = new ArrayList<>(Arrays.asList(offers));

        myOffers.removeIf(p->!p.isFullTime ||p.salary<100_000 || !p.location.equalsIgnoreCase("Fairfax"));

        System.out.println(myOffers.size());

        for(int i=0; i<myOffers.size(); i++){
            System.out.println( myOffers.get(i));
        }


    }
}

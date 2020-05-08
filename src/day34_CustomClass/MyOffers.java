package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("Fairfax","Wells Fargo", 120000,true);

        Offer offer2 = new Offer();

        offer2.setOfferInfo("Chantilly", "Visa", 85000,true);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("Springfield", "Toyota company", 70000, false);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("Falls Church", "Amazon", 90000, true);

        Offer offer5 =new Offer();
        offer5.setOfferInfo("Rockville", "Google", 135000,false);

        ArrayList<Offer> offers = new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));


        for(int i=0; i<offers.size(); i++){
            System.out.println(offers.get(i));
        }
        System.out.println("=======================================================");
        offers.removeIf(p-> !p.isFullTime);

        System.out.println(offers);
        System.out.println("==========================================================");

        offers.removeIf(p-> p.salary<100000);
        System.out.println(offers);
        System.out.println("===============================================================");

        offers.removeIf(p-> !p.location.contains("Fairfax"));
        System.out.println(offers);


    }

}
